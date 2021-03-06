/*
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License
 * is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express
 * or implied. See the License for the specific language governing permissions and limitations under
 * the License.
 */
/*
 * This code was generated by https://github.com/googleapis/google-api-java-client-services/
 * Modify at your own risk.
 */

package com.google.api.services.bigquery.model;

/**
 * Model evaluation metrics for ARIMA forecasting models.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ArimaForecastingMetrics extends com.google.api.client.json.GenericJson {

  /**
   * Arima model fitting metrics.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ArimaFittingMetrics> arimaFittingMetrics;

  static {
    // hack to force ProGuard to consider ArimaFittingMetrics used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(ArimaFittingMetrics.class);
  }

  /**
   * Repeated as there can be many metric sets (one for each model) in auto-arima and the large-
   * scale case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ArimaSingleModelForecastingMetrics> arimaSingleModelForecastingMetrics;

  /**
   * Whether Arima model fitted with drift or not. It is always false when d is not 1.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.Boolean> hasDrift;

  /**
   * Non-seasonal order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ArimaOrder> nonSeasonalOrder;

  /**
   * Seasonal periods. Repeated because multiple periods are supported for one time series.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> seasonalPeriods;

  /**
   * Id to differentiate different time series for the large-scale case.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> timeSeriesId;

  /**
   * Arima model fitting metrics.
   * @return value or {@code null} for none
   */
  public java.util.List<ArimaFittingMetrics> getArimaFittingMetrics() {
    return arimaFittingMetrics;
  }

  /**
   * Arima model fitting metrics.
   * @param arimaFittingMetrics arimaFittingMetrics or {@code null} for none
   */
  public ArimaForecastingMetrics setArimaFittingMetrics(java.util.List<ArimaFittingMetrics> arimaFittingMetrics) {
    this.arimaFittingMetrics = arimaFittingMetrics;
    return this;
  }

  /**
   * Repeated as there can be many metric sets (one for each model) in auto-arima and the large-
   * scale case.
   * @return value or {@code null} for none
   */
  public java.util.List<ArimaSingleModelForecastingMetrics> getArimaSingleModelForecastingMetrics() {
    return arimaSingleModelForecastingMetrics;
  }

  /**
   * Repeated as there can be many metric sets (one for each model) in auto-arima and the large-
   * scale case.
   * @param arimaSingleModelForecastingMetrics arimaSingleModelForecastingMetrics or {@code null} for none
   */
  public ArimaForecastingMetrics setArimaSingleModelForecastingMetrics(java.util.List<ArimaSingleModelForecastingMetrics> arimaSingleModelForecastingMetrics) {
    this.arimaSingleModelForecastingMetrics = arimaSingleModelForecastingMetrics;
    return this;
  }

  /**
   * Whether Arima model fitted with drift or not. It is always false when d is not 1.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Boolean> getHasDrift() {
    return hasDrift;
  }

  /**
   * Whether Arima model fitted with drift or not. It is always false when d is not 1.
   * @param hasDrift hasDrift or {@code null} for none
   */
  public ArimaForecastingMetrics setHasDrift(java.util.List<java.lang.Boolean> hasDrift) {
    this.hasDrift = hasDrift;
    return this;
  }

  /**
   * Non-seasonal order.
   * @return value or {@code null} for none
   */
  public java.util.List<ArimaOrder> getNonSeasonalOrder() {
    return nonSeasonalOrder;
  }

  /**
   * Non-seasonal order.
   * @param nonSeasonalOrder nonSeasonalOrder or {@code null} for none
   */
  public ArimaForecastingMetrics setNonSeasonalOrder(java.util.List<ArimaOrder> nonSeasonalOrder) {
    this.nonSeasonalOrder = nonSeasonalOrder;
    return this;
  }

  /**
   * Seasonal periods. Repeated because multiple periods are supported for one time series.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getSeasonalPeriods() {
    return seasonalPeriods;
  }

  /**
   * Seasonal periods. Repeated because multiple periods are supported for one time series.
   * @param seasonalPeriods seasonalPeriods or {@code null} for none
   */
  public ArimaForecastingMetrics setSeasonalPeriods(java.util.List<java.lang.String> seasonalPeriods) {
    this.seasonalPeriods = seasonalPeriods;
    return this;
  }

  /**
   * Id to differentiate different time series for the large-scale case.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getTimeSeriesId() {
    return timeSeriesId;
  }

  /**
   * Id to differentiate different time series for the large-scale case.
   * @param timeSeriesId timeSeriesId or {@code null} for none
   */
  public ArimaForecastingMetrics setTimeSeriesId(java.util.List<java.lang.String> timeSeriesId) {
    this.timeSeriesId = timeSeriesId;
    return this;
  }

  @Override
  public ArimaForecastingMetrics set(String fieldName, Object value) {
    return (ArimaForecastingMetrics) super.set(fieldName, value);
  }

  @Override
  public ArimaForecastingMetrics clone() {
    return (ArimaForecastingMetrics) super.clone();
  }

}
