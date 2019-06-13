package com.whstone.api;


import com.whstone.api.exception.ErrorResponseException;
import com.whstone.api.response.ExceptionResponse;
import net.sf.json.JSONObject;
import org.apache.commons.httpclient.HttpClient;
import org.apache.commons.httpclient.HttpException;
import org.apache.commons.httpclient.methods.GetMethod;
import org.apache.commons.lang.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.*;
import java.util.Map.Entry;

public abstract class BaseCmd {

    private static final Logger logger = LoggerFactory.getLogger(BaseCmd.class);

    public static final String RESPONSE_TYPE_JSON = "json";
    public static final String RESPONSE_TYPE_XML = "xml";

    protected ApiData apiData;
    // private Object responseObject;
    protected TreeMap<String, Object> params = new TreeMap<String, Object>();
    private String responseType;
    private String responseName;
    protected JSONObject responseJSONObject;
    protected String JsonString;

    public BaseCmd(ApiData apiData, String responseName) {
        this.apiData = apiData;
        this.responseName = responseName;
        if (this.responseType == null)
            setResponseType(RESPONSE_TYPE_JSON);
    }

    public void execute() throws ErrorResponseException {
        JSONObject content = getResponse();
        if (content != null) {
            content = content.getJSONObject(responseName);
            if (StringUtils.isNotEmpty(content.optString(ApiResponseConstants.ERRORCODE))) {
                ExceptionResponse response = (ExceptionResponse) JSONObject.toBean(content, ExceptionResponse.class);
                throw new ErrorResponseException(response);
            }
        }
        this.responseJSONObject = content;
    }

    public String getResponseType() {
        return responseType;
    }

    public void setResponseType(final String responseType) {
        this.responseType = responseType;
        params.put(ApiConstants.RESPONSE, responseType);
    }

    public String getResponseName() {
        return responseName;
    }

    public void setResponseName(String responseName) {
        this.responseName = responseName;
    }

    public String getJsonString() {
        return JsonString;
    }

    public void setJsonString(String jsonString) {
        JsonString = jsonString;
    }

//	protected void setCountAndJob(ListResponse<?> response, JSONObject object) {
//		response.setCount(object.optInt(ApiResponseConstants.COUNT));
//		response.setJobid(object.optString(ApiResponseConstants.JOBID));
//		response.setJobstatus(object.optInt(ApiResponseConstants.JOBSTATUS));
//	}

    private String getParmasString() {
        //	params.put("apikey", apiData.getApiKey());
        String temp = "";
        Set<Entry<String, Object>> c = params.entrySet();
        Iterator<Entry<String, Object>> it = c.iterator();
        while (it.hasNext()) {
            Entry<String, Object> me = it.next();
            String key = me.getKey();
            try {
                if (key.equals(ApiConstants.DETAILS) && me.getValue() instanceof Map) {
                    @SuppressWarnings("unchecked")
                    Map<String, String> map = (Map<String, String>) me.getValue();
                    Set<Entry<String, String>> mapSet = map.entrySet();
                    Iterator<Entry<String, String>> mapIt = mapSet.iterator();
                    int i = 0;
                    while (mapIt.hasNext()) {
                        Entry<String, String> en = mapIt.next();
                        String ck = URLEncoder.encode(en.getKey(), "UTF-8");
                        String cv = URLEncoder.encode(en.getValue().replaceAll(" ", "%20"), "UTF-8");
                        temp += key + "[" + i + "]." + ck + "=" + cv + ",";
                        i++;
                    }
                } else if (me.getValue() instanceof String) {
                    String value = (String) me.getValue();
                    temp += key + "=" + URLEncoder.encode(value.replaceAll(" ", "%20"), "UTF-8") + ",";
                } else if (me.getValue() instanceof Map) {
                    @SuppressWarnings("unchecked")
                    Map<String, String> map = (Map<String, String>) me.getValue();
                    Set<Entry<String, String>> mapSet = map.entrySet();
                    Iterator<Entry<String, String>> mapIt = mapSet.iterator();
                    int i = 0;
                    while (mapIt.hasNext()) {
                        Entry<String, String> en = mapIt.next();
                        String ck = URLEncoder.encode(en.getKey(), "UTF-8");
                        String cv = URLEncoder.encode(en.getValue().replaceAll(" ", "%20"), "UTF-8");
                        temp += key + "[" + i + "].key=" + ck + "," + key + "[" + i + "].value=" + cv + ",";
                        i++;
                    }
                } else if (key.equals(ApiConstants.SUPPORTED_SERVICES) && me.getValue() instanceof List) {
                    @SuppressWarnings("unchecked")
                    List<String> list = (List<String>) me.getValue();
                    String value = "";
                    for (int i = 0; i < list.size(); i++) {
                        if (i == list.size() - 1) {
                            value += list.get(i);
                        } else {
                            value += list.get(i) + ",";
                        }
                    }
                    temp += key + "=" + URLEncoder.encode(value.replaceAll(" ", "%20"), "UTF-8") + ",";
                } else {
                    String value = String.valueOf(me.getValue());
                    temp += key + "=" + URLEncoder.encode(value.replaceAll(" ", "%20"), "UTF-8") + ",";
                }
            } catch (UnsupportedEncodingException e) {
                e.printStackTrace();
            }
        }

        temp = "%5B" + temp.substring(0, temp.length() - 1) + "%5D";

        try {

            return temp;
        } catch (Exception ex) {
            System.out.println(ex);
            return null;
        }
    }

    private JSONObject getResponse() {

        String url = apiData.getBaseUrl() + apiData.getApiPath() + "?parameter=" + getParmasString();
        logger.info(url);
        JSONObject object = getJSONObject(url);
        return object;
    }

    private JSONObject getJSONObject(String url) {
        HttpClient client = new HttpClient();
        GetMethod method = new GetMethod(url);

        try {
            int responseCode = client.executeMethod(method);
            if (responseCode == 200) {

                logger.info("返回的数据为：" + method.getResponseBodyAsString());
            } else {
                logger.info("error=" + method.getResponseBodyAsString());
            }
            String result = method.getResponseBodyAsString().replaceAll("%20", " ").replaceAll("\\t", "").replaceAll("\\n", "");

            //	this.JsonString = result.substring(1,result.length()-1).replaceAll("\\\\","");
            //replaceAll里面用的是正则表达式，所以字符串转义一次，正则转义一次，所以一个斜扛要写4个，用replaceAll( "\\\\ ", " ");
            JSONObject obj = JSONObject.fromObject(result);


            return obj;
        } catch (ClassCastException e) {
            return null;
        } catch (HttpException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return null;
    }


}
