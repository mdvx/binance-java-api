package com.binance.api.client.constant;

import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Constants used throughout Binance's API.
 */
public class BinanceApiConstants {

  /**
   * REST API base URL.
   */
  public static final String API_BASE_URL_TEMPLATE = "https://api.binance.REGION";
  public static String API_BASE_URL;

  /**
   * Streaming API base URL.
   */
  public static final String WS_API_BASE_URL_TEMPLATE = "wss://stream.binance.REGION:9443/ws";
  public static String WS_API_BASE_URL;

  /**
   * Asset info base URL.
   */
  public static final String ASSET_INFO_API_BASE_URL_TEMPLATE = "https://www.binance.REGION/";
  public static String ASSET_INFO_API_BASE_URL;

  /**
   * HTTP Header to be used for API-KEY authentication.
   */
  public static final String API_KEY_HEADER = "X-MBX-APIKEY";

  /**
   * Decorator to indicate that an endpoint requires an API key.
   */
  public static final String ENDPOINT_SECURITY_TYPE_APIKEY = "APIKEY";
  public static final String ENDPOINT_SECURITY_TYPE_APIKEY_HEADER = ENDPOINT_SECURITY_TYPE_APIKEY + ": #";

  /**
   * Decorator to indicate that an endpoint requires a signature.
   */
  public static final String ENDPOINT_SECURITY_TYPE_SIGNED = "SIGNED";
  public static final String ENDPOINT_SECURITY_TYPE_SIGNED_HEADER = ENDPOINT_SECURITY_TYPE_SIGNED + ": #";

  /**
   * Default receiving window.
   */
  public static final long DEFAULT_RECEIVING_WINDOW = 60_000L;

  /**
   * Default margin receiving window.
   */
  public static final long DEFAULT_MARGIN_RECEIVING_WINDOW = 5_000L;

  /**
   * Default ToStringStyle used by toString methods. 
   * Override this to change the output format of the overridden toString methods. 
   *  - Example ToStringStyle.JSON_STYLE
   */
  public static ToStringStyle TO_STRING_BUILDER_STYLE = ToStringStyle.SHORT_PREFIX_STYLE;

  public static void setRegion(String region) {
    BinanceApiConstants.API_BASE_URL = BinanceApiConstants.API_BASE_URL_TEMPLATE.replace(".REGION", region);
    BinanceApiConstants.WS_API_BASE_URL = BinanceApiConstants.WS_API_BASE_URL_TEMPLATE.replace(".REGION", region);
    BinanceApiConstants.ASSET_INFO_API_BASE_URL = BinanceApiConstants.ASSET_INFO_API_BASE_URL_TEMPLATE.replace(".REGION", region);
  }
  static {
    setRegion(".com");
  }
}
