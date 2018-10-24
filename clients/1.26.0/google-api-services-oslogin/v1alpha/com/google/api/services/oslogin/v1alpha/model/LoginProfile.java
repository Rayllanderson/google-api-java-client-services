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

package com.google.api.services.oslogin.v1alpha.model;

/**
 * The user profile information used for logging in to a virtual machine on Google Compute Engine.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud OS Login API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class LoginProfile extends com.google.api.client.json.GenericJson {

  /**
   * A unique user ID.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * The list of POSIX accounts associated with the user.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PosixAccount> posixAccounts;

  static {
    // hack to force ProGuard to consider PosixAccount used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PosixAccount.class);
  }

  /**
   * A map from SSH public key fingerprint to the associated key object.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, SshPublicKey> sshPublicKeys;

  /**
   * A unique user ID.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * A unique user ID.
   * @param name name or {@code null} for none
   */
  public LoginProfile setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * The list of POSIX accounts associated with the user.
   * @return value or {@code null} for none
   */
  public java.util.List<PosixAccount> getPosixAccounts() {
    return posixAccounts;
  }

  /**
   * The list of POSIX accounts associated with the user.
   * @param posixAccounts posixAccounts or {@code null} for none
   */
  public LoginProfile setPosixAccounts(java.util.List<PosixAccount> posixAccounts) {
    this.posixAccounts = posixAccounts;
    return this;
  }

  /**
   * A map from SSH public key fingerprint to the associated key object.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, SshPublicKey> getSshPublicKeys() {
    return sshPublicKeys;
  }

  /**
   * A map from SSH public key fingerprint to the associated key object.
   * @param sshPublicKeys sshPublicKeys or {@code null} for none
   */
  public LoginProfile setSshPublicKeys(java.util.Map<String, SshPublicKey> sshPublicKeys) {
    this.sshPublicKeys = sshPublicKeys;
    return this;
  }

  @Override
  public LoginProfile set(String fieldName, Object value) {
    return (LoginProfile) super.set(fieldName, value);
  }

  @Override
  public LoginProfile clone() {
    return (LoginProfile) super.clone();
  }

}
