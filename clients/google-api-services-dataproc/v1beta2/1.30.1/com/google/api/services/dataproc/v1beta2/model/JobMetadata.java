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

package com.google.api.services.dataproc.v1beta2.model;

/**
 * Job Operation metadata.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Dataproc API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class JobMetadata extends com.google.api.client.json.GenericJson {

  /**
   * Output only. The job id.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String jobId;

  /**
   * Output only. Operation type.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String operationType;

  /**
   * Output only. Job submission time.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String startTime;

  /**
   * Output only. Most recent job status.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private JobStatus status;

  /**
   * Output only. The job id.
   * @return value or {@code null} for none
   */
  public java.lang.String getJobId() {
    return jobId;
  }

  /**
   * Output only. The job id.
   * @param jobId jobId or {@code null} for none
   */
  public JobMetadata setJobId(java.lang.String jobId) {
    this.jobId = jobId;
    return this;
  }

  /**
   * Output only. Operation type.
   * @return value or {@code null} for none
   */
  public java.lang.String getOperationType() {
    return operationType;
  }

  /**
   * Output only. Operation type.
   * @param operationType operationType or {@code null} for none
   */
  public JobMetadata setOperationType(java.lang.String operationType) {
    this.operationType = operationType;
    return this;
  }

  /**
   * Output only. Job submission time.
   * @return value or {@code null} for none
   */
  public String getStartTime() {
    return startTime;
  }

  /**
   * Output only. Job submission time.
   * @param startTime startTime or {@code null} for none
   */
  public JobMetadata setStartTime(String startTime) {
    this.startTime = startTime;
    return this;
  }

  /**
   * Output only. Most recent job status.
   * @return value or {@code null} for none
   */
  public JobStatus getStatus() {
    return status;
  }

  /**
   * Output only. Most recent job status.
   * @param status status or {@code null} for none
   */
  public JobMetadata setStatus(JobStatus status) {
    this.status = status;
    return this;
  }

  @Override
  public JobMetadata set(String fieldName, Object value) {
    return (JobMetadata) super.set(fieldName, value);
  }

  @Override
  public JobMetadata clone() {
    return (JobMetadata) super.clone();
  }

}
