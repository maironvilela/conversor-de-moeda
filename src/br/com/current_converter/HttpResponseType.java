package br.com.current_converter;
import com.google.gson.annotations.SerializedName;

public class HttpResponseType {
    @SerializedName("base_code")
    String baseCode;

    @SerializedName("target_code")
    String targetCode;

    @SerializedName("conversion_rate")
    double convertionRate;

    @SerializedName("result")
    String result;

    @SerializedName("error-type")
    String errorMessage;


    public HttpResponseType(String baseCode, String targetCode, Double convertionRate) {
        this.baseCode = baseCode;
        this.targetCode = targetCode;
        this.convertionRate = convertionRate;
    }

    public String getErrorMessage() {
        return errorMessage;
    }

    public void setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getBaseCode() {
        return baseCode;
    }

    public void setBaseCode(String baseCode) {
        this.baseCode = baseCode;
    }

    public String getTargetCode() {
        return targetCode;
    }

    public void setTargetCode(String targetCode) {
        this.targetCode = targetCode;
    }

    public Double getConvertionRate() {
        return convertionRate;
    }

    public void setConvertionRate(double convertionRate) {
        this.convertionRate = convertionRate;
    }

    @Override
    public String toString() {
        return """
                 
                 1,00 %s => %.2f %s
                """.formatted(baseCode, convertionRate, targetCode);
    }
}
