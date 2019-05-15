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

package com.google.api.services.androidpublisher.model;

/**
 * Model definition for ProductPurchasesAcknowledgeRequest.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Play Developer API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ProductPurchasesAcknowledgeRequest extends com.google.api.client.json.GenericJson {

  /**
   * Payload to attach to the purchase.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String developerPayload;

  /**
   * Payload to attach to the purchase.
   * @return value or {@code null} for none
   */
  public java.lang.String getDeveloperPayload() {
    return developerPayload;
  }

  /**
   * Payload to attach to the purchase.
   * @param developerPayload developerPayload or {@code null} for none
   */
  public ProductPurchasesAcknowledgeRequest setDeveloperPayload(java.lang.String developerPayload) {
    this.developerPayload = developerPayload;
    return this;
  }

  @Override
  public ProductPurchasesAcknowledgeRequest set(String fieldName, Object value) {
    return (ProductPurchasesAcknowledgeRequest) super.set(fieldName, value);
  }

  @Override
  public ProductPurchasesAcknowledgeRequest clone() {
    return (ProductPurchasesAcknowledgeRequest) super.clone();
  }

}
