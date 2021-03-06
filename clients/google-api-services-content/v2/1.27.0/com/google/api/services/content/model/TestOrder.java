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

package com.google.api.services.content.model;

/**
 * Model definition for TestOrder.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Content API for Shopping. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TestOrder extends com.google.api.client.json.GenericJson {

  /**
   * The details of the customer who placed the order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderCustomer customer;

  /**
   * Whether the orderinvoices service should support this order.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableOrderinvoices;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#testOrder".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * Line items that are ordered. At least one line item must be provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TestOrderLineItem> lineItems;

  /**
   * Determines if test order must be pulled by merchant or pushed to merchant via push integration.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String notificationMode;

  /**
   * The details of the payment method.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TestOrderPaymentMethod paymentMethod;

  /**
   * Identifier of one of the predefined delivery addresses for the delivery.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String predefinedDeliveryAddress;

  /**
   * Deprecated. Ignored if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<OrderLegacyPromotion> promotions;

  static {
    // hack to force ProGuard to consider OrderLegacyPromotion used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(OrderLegacyPromotion.class);
  }

  /**
   * The price of shipping for all items. Shipping tax is automatically calculated for MFL orders.
   * For non-MFL orders, tax settings from Merchant Center are applied. Note that shipping is not
   * taxed in certain states.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price shippingCost;

  /**
   * Deprecated. Ignored if provided.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Price shippingCostTax;

  /**
   * The requested shipping option.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String shippingOption;

  /**
   * The details of the customer who placed the order.
   * @return value or {@code null} for none
   */
  public TestOrderCustomer getCustomer() {
    return customer;
  }

  /**
   * The details of the customer who placed the order.
   * @param customer customer or {@code null} for none
   */
  public TestOrder setCustomer(TestOrderCustomer customer) {
    this.customer = customer;
    return this;
  }

  /**
   * Whether the orderinvoices service should support this order.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableOrderinvoices() {
    return enableOrderinvoices;
  }

  /**
   * Whether the orderinvoices service should support this order.
   * @param enableOrderinvoices enableOrderinvoices or {@code null} for none
   */
  public TestOrder setEnableOrderinvoices(java.lang.Boolean enableOrderinvoices) {
    this.enableOrderinvoices = enableOrderinvoices;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#testOrder".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "content#testOrder".
   * @param kind kind or {@code null} for none
   */
  public TestOrder setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * Line items that are ordered. At least one line item must be provided.
   * @return value or {@code null} for none
   */
  public java.util.List<TestOrderLineItem> getLineItems() {
    return lineItems;
  }

  /**
   * Line items that are ordered. At least one line item must be provided.
   * @param lineItems lineItems or {@code null} for none
   */
  public TestOrder setLineItems(java.util.List<TestOrderLineItem> lineItems) {
    this.lineItems = lineItems;
    return this;
  }

  /**
   * Determines if test order must be pulled by merchant or pushed to merchant via push integration.
   * @return value or {@code null} for none
   */
  public java.lang.String getNotificationMode() {
    return notificationMode;
  }

  /**
   * Determines if test order must be pulled by merchant or pushed to merchant via push integration.
   * @param notificationMode notificationMode or {@code null} for none
   */
  public TestOrder setNotificationMode(java.lang.String notificationMode) {
    this.notificationMode = notificationMode;
    return this;
  }

  /**
   * The details of the payment method.
   * @return value or {@code null} for none
   */
  public TestOrderPaymentMethod getPaymentMethod() {
    return paymentMethod;
  }

  /**
   * The details of the payment method.
   * @param paymentMethod paymentMethod or {@code null} for none
   */
  public TestOrder setPaymentMethod(TestOrderPaymentMethod paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

  /**
   * Identifier of one of the predefined delivery addresses for the delivery.
   * @return value or {@code null} for none
   */
  public java.lang.String getPredefinedDeliveryAddress() {
    return predefinedDeliveryAddress;
  }

  /**
   * Identifier of one of the predefined delivery addresses for the delivery.
   * @param predefinedDeliveryAddress predefinedDeliveryAddress or {@code null} for none
   */
  public TestOrder setPredefinedDeliveryAddress(java.lang.String predefinedDeliveryAddress) {
    this.predefinedDeliveryAddress = predefinedDeliveryAddress;
    return this;
  }

  /**
   * Deprecated. Ignored if provided.
   * @return value or {@code null} for none
   */
  public java.util.List<OrderLegacyPromotion> getPromotions() {
    return promotions;
  }

  /**
   * Deprecated. Ignored if provided.
   * @param promotions promotions or {@code null} for none
   */
  public TestOrder setPromotions(java.util.List<OrderLegacyPromotion> promotions) {
    this.promotions = promotions;
    return this;
  }

  /**
   * The price of shipping for all items. Shipping tax is automatically calculated for MFL orders.
   * For non-MFL orders, tax settings from Merchant Center are applied. Note that shipping is not
   * taxed in certain states.
   * @return value or {@code null} for none
   */
  public Price getShippingCost() {
    return shippingCost;
  }

  /**
   * The price of shipping for all items. Shipping tax is automatically calculated for MFL orders.
   * For non-MFL orders, tax settings from Merchant Center are applied. Note that shipping is not
   * taxed in certain states.
   * @param shippingCost shippingCost or {@code null} for none
   */
  public TestOrder setShippingCost(Price shippingCost) {
    this.shippingCost = shippingCost;
    return this;
  }

  /**
   * Deprecated. Ignored if provided.
   * @return value or {@code null} for none
   */
  public Price getShippingCostTax() {
    return shippingCostTax;
  }

  /**
   * Deprecated. Ignored if provided.
   * @param shippingCostTax shippingCostTax or {@code null} for none
   */
  public TestOrder setShippingCostTax(Price shippingCostTax) {
    this.shippingCostTax = shippingCostTax;
    return this;
  }

  /**
   * The requested shipping option.
   * @return value or {@code null} for none
   */
  public java.lang.String getShippingOption() {
    return shippingOption;
  }

  /**
   * The requested shipping option.
   * @param shippingOption shippingOption or {@code null} for none
   */
  public TestOrder setShippingOption(java.lang.String shippingOption) {
    this.shippingOption = shippingOption;
    return this;
  }

  @Override
  public TestOrder set(String fieldName, Object value) {
    return (TestOrder) super.set(fieldName, value);
  }

  @Override
  public TestOrder clone() {
    return (TestOrder) super.clone();
  }

}
