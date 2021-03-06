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
 * Model definition for HivePartitioningOptions.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the BigQuery API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class HivePartitioningOptions extends com.google.api.client.json.GenericJson {

  /**
   * [Optional, Trusted Tester] When set, what mode of hive partitioning to use when reading data.
   * Two modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2)
   * STRINGS: automatically infer partition key name(s). All types are interpreted as strings. Not
   * all storage formats support hive partitioning. Requesting hive partitioning on an unsupported
   * format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and
   * Parquet.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String mode;

  /**
   * [Optional, Trusted Tester] When hive partition detection is requested, a common prefix for all
   * source uris should be supplied. The prefix must end immediately before the partition key
   * encoding begins. For example, consider files following this data layout.
   * gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro
   * gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is
   * requested with either AUTO or STRINGS detection, the common prefix can be either of
   * gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String sourceUriPrefix;

  /**
   * [Optional, Trusted Tester] When set, what mode of hive partitioning to use when reading data.
   * Two modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2)
   * STRINGS: automatically infer partition key name(s). All types are interpreted as strings. Not
   * all storage formats support hive partitioning. Requesting hive partitioning on an unsupported
   * format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and
   * Parquet.
   * @return value or {@code null} for none
   */
  public java.lang.String getMode() {
    return mode;
  }

  /**
   * [Optional, Trusted Tester] When set, what mode of hive partitioning to use when reading data.
   * Two modes are supported. (1) AUTO: automatically infer partition key name(s) and type(s). (2)
   * STRINGS: automatically infer partition key name(s). All types are interpreted as strings. Not
   * all storage formats support hive partitioning. Requesting hive partitioning on an unsupported
   * format will lead to an error. Currently supported types include: AVRO, CSV, JSON, ORC and
   * Parquet.
   * @param mode mode or {@code null} for none
   */
  public HivePartitioningOptions setMode(java.lang.String mode) {
    this.mode = mode;
    return this;
  }

  /**
   * [Optional, Trusted Tester] When hive partition detection is requested, a common prefix for all
   * source uris should be supplied. The prefix must end immediately before the partition key
   * encoding begins. For example, consider files following this data layout.
   * gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro
   * gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is
   * requested with either AUTO or STRINGS detection, the common prefix can be either of
   * gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
   * @return value or {@code null} for none
   */
  public java.lang.String getSourceUriPrefix() {
    return sourceUriPrefix;
  }

  /**
   * [Optional, Trusted Tester] When hive partition detection is requested, a common prefix for all
   * source uris should be supplied. The prefix must end immediately before the partition key
   * encoding begins. For example, consider files following this data layout.
   * gs://bucket/path_to_table/dt=2019-01-01/country=BR/id=7/file.avro
   * gs://bucket/path_to_table/dt=2018-12-31/country=CA/id=3/file.avro When hive partitioning is
   * requested with either AUTO or STRINGS detection, the common prefix can be either of
   * gs://bucket/path_to_table or gs://bucket/path_to_table/ (trailing slash does not matter).
   * @param sourceUriPrefix sourceUriPrefix or {@code null} for none
   */
  public HivePartitioningOptions setSourceUriPrefix(java.lang.String sourceUriPrefix) {
    this.sourceUriPrefix = sourceUriPrefix;
    return this;
  }

  @Override
  public HivePartitioningOptions set(String fieldName, Object value) {
    return (HivePartitioningOptions) super.set(fieldName, value);
  }

  @Override
  public HivePartitioningOptions clone() {
    return (HivePartitioningOptions) super.clone();
  }

}
