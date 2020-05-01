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

package com.google.api.services.drive.model;

/**
 * A permission for a file.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Drive API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Permission extends com.google.api.client.json.GenericJson {

  /**
   * Additional roles for this user. Only commenter is currently allowed, though more may be
   * supported in the future.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<java.lang.String> additionalRoles;

  /**
   * Deprecated.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String authKey;

  /**
   * Whether the account associated with this permission has been deleted. This field only pertains
   * to user and group permissions.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean deleted;

  /**
   * The domain name of the entity this permission refers to. This is an output-only field which is
   * present when the permission type is user, group or domain.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String domain;

  /**
   * The email address of the user or group this permission refers to. This is an output-only field
   * which is present when the permission type is user or group.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String emailAddress;

  /**
   * The ETag of the permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String etag;

  /**
   * The time at which this permission will expire (RFC 3339 date-time). Expiration dates have the
   * following restrictions: - They cannot be set on shared drive items  - They can only be set on
   * user and group permissions  - The date must be in the future  - The date cannot be more than a
   * year in the future  - The date can only be set on drive.permissions.update or
   * drive.permissions.patch requests
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private com.google.api.client.util.DateTime expirationDate;

  /**
   * The ID of the user this permission refers to, and identical to the permissionId in the About
   * and Files resources. When making a drive.permissions.insert request, exactly one of the id or
   * value fields must be specified unless the permission type is anyone, in which case both id and
   * value are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String id;

  /**
   * This is always drive#permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String kind;

  /**
   * The name for this permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Details of whether the permissions on this shared drive item are inherited or directly on this
   * item. This is an output-only field which is present only for shared drive items.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<PermissionDetails> permissionDetails;

  static {
    // hack to force ProGuard to consider PermissionDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(PermissionDetails.class);
  }

  /**
   * A link to the profile photo, if available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String photoLink;

  /**
   * The primary role for this user. While new values may be supported in the future, the following
   * are currently allowed: - owner  - organizer  - fileOrganizer  - writer  - reader
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String role;

  /**
   * A link back to this permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String selfLink;

  /**
   * Deprecated - use permissionDetails instead.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<TeamDrivePermissionDetails> teamDrivePermissionDetails;

  static {
    // hack to force ProGuard to consider TeamDrivePermissionDetails used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(TeamDrivePermissionDetails.class);
  }

  /**
   * The account type. Allowed values are: - user  - group  - domain  - anyone
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The email address or domain name for the entity. This is used during inserts and is not
   * populated in responses. When making a drive.permissions.insert request, exactly one of the id
   * or value fields must be specified unless the permission type is anyone, in which case both id
   * and value are ignored.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * Whether the link is required for this permission.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean withLink;

  /**
   * Additional roles for this user. Only commenter is currently allowed, though more may be
   * supported in the future.
   * @return value or {@code null} for none
   */
  public java.util.List<java.lang.String> getAdditionalRoles() {
    return additionalRoles;
  }

  /**
   * Additional roles for this user. Only commenter is currently allowed, though more may be
   * supported in the future.
   * @param additionalRoles additionalRoles or {@code null} for none
   */
  public Permission setAdditionalRoles(java.util.List<java.lang.String> additionalRoles) {
    this.additionalRoles = additionalRoles;
    return this;
  }

  /**
   * Deprecated.
   * @return value or {@code null} for none
   */
  public java.lang.String getAuthKey() {
    return authKey;
  }

  /**
   * Deprecated.
   * @param authKey authKey or {@code null} for none
   */
  public Permission setAuthKey(java.lang.String authKey) {
    this.authKey = authKey;
    return this;
  }

  /**
   * Whether the account associated with this permission has been deleted. This field only pertains
   * to user and group permissions.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getDeleted() {
    return deleted;
  }

  /**
   * Whether the account associated with this permission has been deleted. This field only pertains
   * to user and group permissions.
   * @param deleted deleted or {@code null} for none
   */
  public Permission setDeleted(java.lang.Boolean deleted) {
    this.deleted = deleted;
    return this;
  }

  /**
   * The domain name of the entity this permission refers to. This is an output-only field which is
   * present when the permission type is user, group or domain.
   * @return value or {@code null} for none
   */
  public java.lang.String getDomain() {
    return domain;
  }

  /**
   * The domain name of the entity this permission refers to. This is an output-only field which is
   * present when the permission type is user, group or domain.
   * @param domain domain or {@code null} for none
   */
  public Permission setDomain(java.lang.String domain) {
    this.domain = domain;
    return this;
  }

  /**
   * The email address of the user or group this permission refers to. This is an output-only field
   * which is present when the permission type is user or group.
   * @return value or {@code null} for none
   */
  public java.lang.String getEmailAddress() {
    return emailAddress;
  }

  /**
   * The email address of the user or group this permission refers to. This is an output-only field
   * which is present when the permission type is user or group.
   * @param emailAddress emailAddress or {@code null} for none
   */
  public Permission setEmailAddress(java.lang.String emailAddress) {
    this.emailAddress = emailAddress;
    return this;
  }

  /**
   * The ETag of the permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getEtag() {
    return etag;
  }

  /**
   * The ETag of the permission.
   * @param etag etag or {@code null} for none
   */
  public Permission setEtag(java.lang.String etag) {
    this.etag = etag;
    return this;
  }

  /**
   * The time at which this permission will expire (RFC 3339 date-time). Expiration dates have the
   * following restrictions: - They cannot be set on shared drive items  - They can only be set on
   * user and group permissions  - The date must be in the future  - The date cannot be more than a
   * year in the future  - The date can only be set on drive.permissions.update or
   * drive.permissions.patch requests
   * @return value or {@code null} for none
   */
  public com.google.api.client.util.DateTime getExpirationDate() {
    return expirationDate;
  }

  /**
   * The time at which this permission will expire (RFC 3339 date-time). Expiration dates have the
   * following restrictions: - They cannot be set on shared drive items  - They can only be set on
   * user and group permissions  - The date must be in the future  - The date cannot be more than a
   * year in the future  - The date can only be set on drive.permissions.update or
   * drive.permissions.patch requests
   * @param expirationDate expirationDate or {@code null} for none
   */
  public Permission setExpirationDate(com.google.api.client.util.DateTime expirationDate) {
    this.expirationDate = expirationDate;
    return this;
  }

  /**
   * The ID of the user this permission refers to, and identical to the permissionId in the About
   * and Files resources. When making a drive.permissions.insert request, exactly one of the id or
   * value fields must be specified unless the permission type is anyone, in which case both id and
   * value are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getId() {
    return id;
  }

  /**
   * The ID of the user this permission refers to, and identical to the permissionId in the About
   * and Files resources. When making a drive.permissions.insert request, exactly one of the id or
   * value fields must be specified unless the permission type is anyone, in which case both id and
   * value are ignored.
   * @param id id or {@code null} for none
   */
  public Permission setId(java.lang.String id) {
    this.id = id;
    return this;
  }

  /**
   * This is always drive#permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getKind() {
    return kind;
  }

  /**
   * This is always drive#permission.
   * @param kind kind or {@code null} for none
   */
  public Permission setKind(java.lang.String kind) {
    this.kind = kind;
    return this;
  }

  /**
   * The name for this permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name for this permission.
   * @param name name or {@code null} for none
   */
  public Permission setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Details of whether the permissions on this shared drive item are inherited or directly on this
   * item. This is an output-only field which is present only for shared drive items.
   * @return value or {@code null} for none
   */
  public java.util.List<PermissionDetails> getPermissionDetails() {
    return permissionDetails;
  }

  /**
   * Details of whether the permissions on this shared drive item are inherited or directly on this
   * item. This is an output-only field which is present only for shared drive items.
   * @param permissionDetails permissionDetails or {@code null} for none
   */
  public Permission setPermissionDetails(java.util.List<PermissionDetails> permissionDetails) {
    this.permissionDetails = permissionDetails;
    return this;
  }

  /**
   * A link to the profile photo, if available.
   * @return value or {@code null} for none
   */
  public java.lang.String getPhotoLink() {
    return photoLink;
  }

  /**
   * A link to the profile photo, if available.
   * @param photoLink photoLink or {@code null} for none
   */
  public Permission setPhotoLink(java.lang.String photoLink) {
    this.photoLink = photoLink;
    return this;
  }

  /**
   * The primary role for this user. While new values may be supported in the future, the following
   * are currently allowed: - owner  - organizer  - fileOrganizer  - writer  - reader
   * @return value or {@code null} for none
   */
  public java.lang.String getRole() {
    return role;
  }

  /**
   * The primary role for this user. While new values may be supported in the future, the following
   * are currently allowed: - owner  - organizer  - fileOrganizer  - writer  - reader
   * @param role role or {@code null} for none
   */
  public Permission setRole(java.lang.String role) {
    this.role = role;
    return this;
  }

  /**
   * A link back to this permission.
   * @return value or {@code null} for none
   */
  public java.lang.String getSelfLink() {
    return selfLink;
  }

  /**
   * A link back to this permission.
   * @param selfLink selfLink or {@code null} for none
   */
  public Permission setSelfLink(java.lang.String selfLink) {
    this.selfLink = selfLink;
    return this;
  }

  /**
   * Deprecated - use permissionDetails instead.
   * @return value or {@code null} for none
   */
  public java.util.List<TeamDrivePermissionDetails> getTeamDrivePermissionDetails() {
    return teamDrivePermissionDetails;
  }

  /**
   * Deprecated - use permissionDetails instead.
   * @param teamDrivePermissionDetails teamDrivePermissionDetails or {@code null} for none
   */
  public Permission setTeamDrivePermissionDetails(java.util.List<TeamDrivePermissionDetails> teamDrivePermissionDetails) {
    this.teamDrivePermissionDetails = teamDrivePermissionDetails;
    return this;
  }

  /**
   * The account type. Allowed values are: - user  - group  - domain  - anyone
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * The account type. Allowed values are: - user  - group  - domain  - anyone
   * @param type type or {@code null} for none
   */
  public Permission setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  /**
   * The email address or domain name for the entity. This is used during inserts and is not
   * populated in responses. When making a drive.permissions.insert request, exactly one of the id
   * or value fields must be specified unless the permission type is anyone, in which case both id
   * and value are ignored.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The email address or domain name for the entity. This is used during inserts and is not
   * populated in responses. When making a drive.permissions.insert request, exactly one of the id
   * or value fields must be specified unless the permission type is anyone, in which case both id
   * and value are ignored.
   * @param value value or {@code null} for none
   */
  public Permission setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  /**
   * Whether the link is required for this permission.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getWithLink() {
    return withLink;
  }

  /**
   * Whether the link is required for this permission.
   * @param withLink withLink or {@code null} for none
   */
  public Permission setWithLink(java.lang.Boolean withLink) {
    this.withLink = withLink;
    return this;
  }

  @Override
  public Permission set(String fieldName, Object value) {
    return (Permission) super.set(fieldName, value);
  }

  @Override
  public Permission clone() {
    return (Permission) super.clone();
  }

  /**
   * Model definition for PermissionPermissionDetails.
   */
  public static final class PermissionDetails extends com.google.api.client.json.GenericJson {

    /**
     * Additional roles for this user. Only commenter is currently possible, though more may be
     * supported in the future.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> additionalRoles;

    /**
     * Whether this permission is inherited. This field is always populated. This is an output-only
     * field.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean inherited;

    /**
     * The ID of the item from which this permission is inherited. This is an output-only field.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String inheritedFrom;

    /**
     * The permission type for this user. While new values may be added in future, the following are
     * currently possible: - file  - member
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String permissionType;

    /**
     * The primary role for this user. While new values may be added in the future, the following are
     * currently possible: - organizer  - fileOrganizer  - writer  - reader
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String role;

    /**
     * Additional roles for this user. Only commenter is currently possible, though more may be
     * supported in the future.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getAdditionalRoles() {
      return additionalRoles;
    }

    /**
     * Additional roles for this user. Only commenter is currently possible, though more may be
     * supported in the future.
     * @param additionalRoles additionalRoles or {@code null} for none
     */
    public PermissionDetails setAdditionalRoles(java.util.List<java.lang.String> additionalRoles) {
      this.additionalRoles = additionalRoles;
      return this;
    }

    /**
     * Whether this permission is inherited. This field is always populated. This is an output-only
     * field.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getInherited() {
      return inherited;
    }

    /**
     * Whether this permission is inherited. This field is always populated. This is an output-only
     * field.
     * @param inherited inherited or {@code null} for none
     */
    public PermissionDetails setInherited(java.lang.Boolean inherited) {
      this.inherited = inherited;
      return this;
    }

    /**
     * The ID of the item from which this permission is inherited. This is an output-only field.
     * @return value or {@code null} for none
     */
    public java.lang.String getInheritedFrom() {
      return inheritedFrom;
    }

    /**
     * The ID of the item from which this permission is inherited. This is an output-only field.
     * @param inheritedFrom inheritedFrom or {@code null} for none
     */
    public PermissionDetails setInheritedFrom(java.lang.String inheritedFrom) {
      this.inheritedFrom = inheritedFrom;
      return this;
    }

    /**
     * The permission type for this user. While new values may be added in future, the following are
     * currently possible: - file  - member
     * @return value or {@code null} for none
     */
    public java.lang.String getPermissionType() {
      return permissionType;
    }

    /**
     * The permission type for this user. While new values may be added in future, the following are
     * currently possible: - file  - member
     * @param permissionType permissionType or {@code null} for none
     */
    public PermissionDetails setPermissionType(java.lang.String permissionType) {
      this.permissionType = permissionType;
      return this;
    }

    /**
     * The primary role for this user. While new values may be added in the future, the following are
     * currently possible: - organizer  - fileOrganizer  - writer  - reader
     * @return value or {@code null} for none
     */
    public java.lang.String getRole() {
      return role;
    }

    /**
     * The primary role for this user. While new values may be added in the future, the following are
     * currently possible: - organizer  - fileOrganizer  - writer  - reader
     * @param role role or {@code null} for none
     */
    public PermissionDetails setRole(java.lang.String role) {
      this.role = role;
      return this;
    }

    @Override
    public PermissionDetails set(String fieldName, Object value) {
      return (PermissionDetails) super.set(fieldName, value);
    }

    @Override
    public PermissionDetails clone() {
      return (PermissionDetails) super.clone();
    }

  }

  /**
   * Model definition for PermissionTeamDrivePermissionDetails.
   */
  public static final class TeamDrivePermissionDetails extends com.google.api.client.json.GenericJson {

    /**
     * Deprecated - use permissionDetails/additionalRoles instead.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.util.List<java.lang.String> additionalRoles;

    /**
     * Deprecated - use permissionDetails/inherited instead.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.Boolean inherited;

    /**
     * Deprecated - use permissionDetails/inheritedFrom instead.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String inheritedFrom;

    /**
     * Deprecated - use permissionDetails/role instead.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String role;

    /**
     * Deprecated - use permissionDetails/permissionType instead.
     * The value may be {@code null}.
     */
    @com.google.api.client.util.Key
    private java.lang.String teamDrivePermissionType;

    /**
     * Deprecated - use permissionDetails/additionalRoles instead.
     * @return value or {@code null} for none
     */
    public java.util.List<java.lang.String> getAdditionalRoles() {
      return additionalRoles;
    }

    /**
     * Deprecated - use permissionDetails/additionalRoles instead.
     * @param additionalRoles additionalRoles or {@code null} for none
     */
    public TeamDrivePermissionDetails setAdditionalRoles(java.util.List<java.lang.String> additionalRoles) {
      this.additionalRoles = additionalRoles;
      return this;
    }

    /**
     * Deprecated - use permissionDetails/inherited instead.
     * @return value or {@code null} for none
     */
    public java.lang.Boolean getInherited() {
      return inherited;
    }

    /**
     * Deprecated - use permissionDetails/inherited instead.
     * @param inherited inherited or {@code null} for none
     */
    public TeamDrivePermissionDetails setInherited(java.lang.Boolean inherited) {
      this.inherited = inherited;
      return this;
    }

    /**
     * Deprecated - use permissionDetails/inheritedFrom instead.
     * @return value or {@code null} for none
     */
    public java.lang.String getInheritedFrom() {
      return inheritedFrom;
    }

    /**
     * Deprecated - use permissionDetails/inheritedFrom instead.
     * @param inheritedFrom inheritedFrom or {@code null} for none
     */
    public TeamDrivePermissionDetails setInheritedFrom(java.lang.String inheritedFrom) {
      this.inheritedFrom = inheritedFrom;
      return this;
    }

    /**
     * Deprecated - use permissionDetails/role instead.
     * @return value or {@code null} for none
     */
    public java.lang.String getRole() {
      return role;
    }

    /**
     * Deprecated - use permissionDetails/role instead.
     * @param role role or {@code null} for none
     */
    public TeamDrivePermissionDetails setRole(java.lang.String role) {
      this.role = role;
      return this;
    }

    /**
     * Deprecated - use permissionDetails/permissionType instead.
     * @return value or {@code null} for none
     */
    public java.lang.String getTeamDrivePermissionType() {
      return teamDrivePermissionType;
    }

    /**
     * Deprecated - use permissionDetails/permissionType instead.
     * @param teamDrivePermissionType teamDrivePermissionType or {@code null} for none
     */
    public TeamDrivePermissionDetails setTeamDrivePermissionType(java.lang.String teamDrivePermissionType) {
      this.teamDrivePermissionType = teamDrivePermissionType;
      return this;
    }

    @Override
    public TeamDrivePermissionDetails set(String fieldName, Object value) {
      return (TeamDrivePermissionDetails) super.set(fieldName, value);
    }

    @Override
    public TeamDrivePermissionDetails clone() {
      return (TeamDrivePermissionDetails) super.clone();
    }

  }

}
