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
 * RollbackNodePoolUpgradeRequest rollbacks the previously Aborted or Failed NodePool upgrade. This
 * will be an no-op if the last upgrade successfully completed.
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
public final class RollbackNodePoolUpgradeRequest extends com.google.api.client.json.GenericJson {

  /**
   * Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by
   * the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String clusterId;

  /**
   * The name (project, location, cluster, node pool id) of the node poll to rollback upgrade.
   * Specified in the format 'projects/locations/clusters/nodePools'.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String name;

  /**
   * Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced
   * by the name field.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String nodePoolId;

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
   * Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by
   * the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getClusterId() {
    return clusterId;
  }

  /**
   * Deprecated. The name of the cluster to rollback. This field has been deprecated and replaced by
   * the name field.
   * @param clusterId clusterId or {@code null} for none
   */
  public RollbackNodePoolUpgradeRequest setClusterId(java.lang.String clusterId) {
    this.clusterId = clusterId;
    return this;
  }

  /**
   * The name (project, location, cluster, node pool id) of the node poll to rollback upgrade.
   * Specified in the format 'projects/locations/clusters/nodePools'.
   * @return value or {@code null} for none
   */
  public java.lang.String getName() {
    return name;
  }

  /**
   * The name (project, location, cluster, node pool id) of the node poll to rollback upgrade.
   * Specified in the format 'projects/locations/clusters/nodePools'.
   * @param name name or {@code null} for none
   */
  public RollbackNodePoolUpgradeRequest setName(java.lang.String name) {
    this.name = name;
    return this;
  }

  /**
   * Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced
   * by the name field.
   * @return value or {@code null} for none
   */
  public java.lang.String getNodePoolId() {
    return nodePoolId;
  }

  /**
   * Deprecated. The name of the node pool to rollback. This field has been deprecated and replaced
   * by the name field.
   * @param nodePoolId nodePoolId or {@code null} for none
   */
  public RollbackNodePoolUpgradeRequest setNodePoolId(java.lang.String nodePoolId) {
    this.nodePoolId = nodePoolId;
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
  public RollbackNodePoolUpgradeRequest setProjectId(java.lang.String projectId) {
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
  public RollbackNodePoolUpgradeRequest setZone(java.lang.String zone) {
    this.zone = zone;
    return this;
  }

  @Override
  public RollbackNodePoolUpgradeRequest set(String fieldName, Object value) {
    return (RollbackNodePoolUpgradeRequest) super.set(fieldName, value);
  }

  @Override
  public RollbackNodePoolUpgradeRequest clone() {
    return (RollbackNodePoolUpgradeRequest) super.clone();
  }

}
