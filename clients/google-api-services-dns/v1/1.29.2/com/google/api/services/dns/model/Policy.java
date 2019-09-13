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

package com.google.api.services.dns.model;

/**
 * A policy is a collection of DNS rules applied to one or more Virtual Private Cloud resources.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Google Cloud DNS API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Policy extends com.google.api.client.json.GenericJson {

  /**
   * Sets an alternative name server for the associated networks. When specified, all DNS queries
   * are forwarded to a name server that you choose. Names such as .internal are not available when
   * an alternative name server is specified.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private PolicyAlternativeNameServerConfig alternativeNameServerConfig;

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the policy's function.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String description;

  /**
   * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over
   * VPN connections. When enabled, a virtual IP address will be allocated from each of the sub-
   * networks that are bound to this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean enableInboundForwarding;

  /**
   * Unique identifier for the resource; defined by the server (output only).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.math.BigInteger id;

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#policy".
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * User assigned name for this policy.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * List of network names specifying networks to which this policy is applied.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PolicyNetwork> networks;

  /**
   * Sets an alternative name server for the associated networks. When specified, all DNS queries
   * are forwarded to a name server that you choose. Names such as .internal are not available when
   * an alternative name server is specified.
   * @return value or {@code null} for none
   */
  public PolicyAlternativeNameServerConfig getAlternativeNameServerConfig() {
    return alternativeNameServerConfig;
  }

  /**
   * Sets an alternative name server for the associated networks. When specified, all DNS queries
   * are forwarded to a name server that you choose. Names such as .internal are not available when
   * an alternative name server is specified.
   * @param alternativeNameServerConfig alternativeNameServerConfig or {@code null} for none
   */
  public Policy setAlternativeNameServerConfig(PolicyAlternativeNameServerConfig alternativeNameServerConfig) {
    this.alternativeNameServerConfig = alternativeNameServerConfig;
    return this;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the policy's function.
   * @return value or {@code null} for none
   */
  public java.lang.String getDescription() {
    return description;
  }

  /**
   * A mutable string of at most 1024 characters associated with this resource for the user's
   * convenience. Has no effect on the policy's function.
   * @param description description or {@code null} for none
   */
  public Policy setDescription(java.lang.String description) {
    this.description = description;
    return this;
  }

  /**
   * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over
   * VPN connections. When enabled, a virtual IP address will be allocated from each of the sub-
   * networks that are bound to this policy.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getEnableInboundForwarding() {
    return enableInboundForwarding;
  }

  /**
   * Allows networks bound to this policy to receive DNS queries sent by VMs or applications over
   * VPN connections. When enabled, a virtual IP address will be allocated from each of the sub-
   * networks that are bound to this policy.
   * @param enableInboundForwarding enableInboundForwarding or {@code null} for none
   */
  public Policy setEnableInboundForwarding(java.lang.Boolean enableInboundForwarding) {
    this.enableInboundForwarding = enableInboundForwarding;
    return this;
  }

  /**
   * Unique identifier for the resource; defined by the server (output only).
   * @return value or {@code null} for none
   */
  public java.math.BigInteger getId() {
    return id;
  }

  /**
   * Unique identifier for the resource; defined by the server (output only).
   * @param id id or {@code null} for none
   */
  public Policy setId(java.math.BigInteger id) {
    this.id = id;
    return this;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#policy".
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * Identifies what kind of resource this is. Value: the fixed string "dns#policy".
   * @param kind kind or {@code null} for none
   */
  public Policy setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * User assigned name for this policy.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * User assigned name for this policy.
   * @param name name or {@code null} for none
   */
  public Policy setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * List of network names specifying networks to which this policy is applied.
   * @return value or {@code null} for none
   */
  public java.util.List<PolicyNetwork> getNetworks() {
    return networks;
  }

  /**
   * List of network names specifying networks to which this policy is applied.
   * @param networks networks or {@code null} for none
   */
  public Policy setNetworks(java.util.List<PolicyNetwork> networks) {
    this.networks = networks;
    return this;
  }

  @Override
  public Policy set(String fieldName, Object value) {
    return (Policy) super.set(fieldName, value);
  }

  @Override
  public Policy clone() {
    return (Policy) super.clone();
  }

}
