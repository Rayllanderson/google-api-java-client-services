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

package com.google.api.services.container.model;

/**
 * UpdateMasterRequest updates the master of the cluster.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Kubernetes Engine API. For a detailed explanation
 * see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class UpdateMasterRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * Required. The Kubernetes version to change the master to.
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default
   * Kubernetes version
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String masterVersion;

  /**
   * The name (project, location, cluster) of the cluster to update. Specified in the format
   * 'projects/locations/clusters'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String projectId;

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String zone;

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster to upgrade. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public UpdateMasterRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * Required. The Kubernetes version to change the master to.
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default
   * Kubernetes version
   * @return value or {@code null} for none
   */
  public java.lang.String getMasterVersion() {
    return masterVersion;
  }

  /**
   * Required. The Kubernetes version to change the master to.
   *
   * Users may specify either explicit versions offered by Kubernetes Engine or version aliases,
   * which have the following behavior:
   *
   * - "latest": picks the highest valid Kubernetes version - "1.X": picks the highest valid
   * patch+gke.N patch in the 1.X version - "1.X.Y": picks the highest valid gke.N patch in the
   * 1.X.Y version - "1.X.Y-gke.N": picks an explicit Kubernetes version - "-": picks the default
   * Kubernetes version
   * @param masterVersion masterVersion or {@code null} for none
   */
  public UpdateMasterRequest setMasterVersion(java.lang.String masterVersion) {
    this.masterVersion = masterVersion;
    return this;
  }

  /**
   * The name (project, location, cluster) of the cluster to update. Specified in the format
   * 'projects/locations/clusters'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster) of the cluster to update. Specified in the format
   * 'projects/locations/clusters'.
   * @param name name or {@code null} for none
   */
  public UpdateMasterRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getProjectId() {
    return projectId;
  }

  /**
   * Deprecated. The Google Developers Console [project ID or project
   * number](https://support.google.com/cloud/answer/6158840). This field has been deprecated and
   * replaced by the name field.
   * @param projectId projectId or {@code null} for none
   */
  public UpdateMasterRequest setProjectId(java.lang.String projectId) {
    this.projectId = projectId;
    return this;
  }

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getZone() {
    return zone;
  }

  /**
   * Deprecated. The name of the Google Compute Engine
   * [zone](https://cloud.google.com/compute/docs/zones#available) in which the cluster resides.
   * This field has been deprecated and replaced by the name field.
   * @param zone zone or {@code null} for none
   */
  public UpdateMasterRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public UpdateMasterRequest set(String fieldName, Object value) {
    return (UpdateMasterRequest) super.set(fieldName, value);
  }

  @Override
  public UpdateMasterRequest clone() {
    return (UpdateMasterRequest) super.clone();
  }

}
