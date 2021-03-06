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

package com.google.api.services.doubleclickbidmanager.model;

/**
 * Request to fetch stored line items.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the DoubleClick Bid Manager API. For a detailed
 * explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class DownloadLineItemsRequest extends com.google.api.client.json.GenericJson {

  /**
   * File specification (column names, types, order) in which the line items will be returned.
   * Default to EWF.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String fileSpec;

  /**
   * Ids of the specified filter type used to filter line items to fetch. If omitted, all the line
   * items will be returned.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.util.List<java.lang.Long> filterIds;

  /**
   * Filter type used to filter line items to fetch.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String filterType;

  /**
   * Format in which the line items will be returned. Default to CSV.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String format;

  /**
   * File specification (column names, types, order) in which the line items will be returned.
   * Default to EWF.
   * @return value or {@code null} for none
   */
  public java.lang.String getFileSpec() {
    return fileSpec;
  }

  /**
   * File specification (column names, types, order) in which the line items will be returned.
   * Default to EWF.
   * @param fileSpec fileSpec or {@code null} for none
   */
  public DownloadLineItemsRequest setFileSpec(java.lang.String fileSpec) {
    this.fileSpec = fileSpec;
    return this;
  }

  /**
   * Ids of the specified filter type used to filter line items to fetch. If omitted, all the line
   * items will be returned.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.Long> getFilterIds() {
    return filterIds;
  }

  /**
   * Ids of the specified filter type used to filter line items to fetch. If omitted, all the line
   * items will be returned.
   * @param filterIds filterIds or {@code null} for none
   */
  public DownloadLineItemsRequest setFilterIds(java.util.List<java.lang.Long> filterIds) {
    this.filterIds = filterIds;
    return this;
  }

  /**
   * Filter type used to filter line items to fetch.
   * @return value or {@code null} for none
   */
  public java.lang.String getFilterType() {
    return filterType;
  }

  /**
   * Filter type used to filter line items to fetch.
   * @param filterType filterType or {@code null} for none
   */
  public DownloadLineItemsRequest setFilterType(java.lang.String filterType) {
    this.filterType = filterType;
    return this;
  }

  /**
   * Format in which the line items will be returned. Default to CSV.
   * @return value or {@code null} for none
   */
  public java.lang.String getFormat() {
    return format;
  }

  /**
   * Format in which the line items will be returned. Default to CSV.
   * @param format format or {@code null} for none
   */
  public DownloadLineItemsRequest setFormat(java.lang.String format) {
    this.format = format;
    return this;
  }

  @Override
  public DownloadLineItemsRequest set(String fieldName, Object value) {
    return (DownloadLineItemsRequest) super.set(fieldName, value);
  }

  @Override
  public DownloadLineItemsRequest clone() {
    return (DownloadLineItemsRequest) super.clone();
  }

}
