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

package com.google.api.services.script.model;

/**
 * An object that provides information about the nature of an error resulting from an attempted
 * execution of a script function using the Apps Script API. If a run call succeeds but the script
 * function (or Apps Script itself) throws an exception, the response body's error field contains a
 * Status object. The `Status` object's `details` field contains an array with a single one of these
 * `ExecutionError` objects.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Apps Script API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ExecutionError extends com.google.api.client.json.GenericJson {

  /**
   * The error message thrown by Apps Script, usually localized into the user's language.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorMessage;

  /**
   * The error type, for example `TypeError` or `ReferenceError`. If the error type is unavailable,
   * this field is not included.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String errorType;

  /**
   * An array of objects that provide a stack trace through the script to show where the execution
   * failed, with the deepest call first.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<ScriptStackTraceElement> scriptStackTraceElements;

  /**
   * The error message thrown by Apps Script, usually localized into the user's language.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorMessage() {
    return errorMessage;
  }

  /**
   * The error message thrown by Apps Script, usually localized into the user's language.
   * @param errorMessage errorMessage or {@code null} for none
   */
  public ExecutionError setErrorMessage(java.lang.String errorMessage) {
    this.errorMessage = errorMessage;
    return this;
  }

  /**
   * The error type, for example `TypeError` or `ReferenceError`. If the error type is unavailable,
   * this field is not included.
   * @return value or {@code null} for none
   */
  public java.lang.String getErrorType() {
    return errorType;
  }

  /**
   * The error type, for example `TypeError` or `ReferenceError`. If the error type is unavailable,
   * this field is not included.
   * @param errorType errorType or {@code null} for none
   */
  public ExecutionError setErrorType(java.lang.String errorType) {
    this.errorType = errorType;
    return this;
  }

  /**
   * An array of objects that provide a stack trace through the script to show where the execution
   * failed, with the deepest call first.
   * @return value or {@code null} for none
   */
  public java.util.List<ScriptStackTraceElement> getScriptStackTraceElements() {
    return scriptStackTraceElements;
  }

  /**
   * An array of objects that provide a stack trace through the script to show where the execution
   * failed, with the deepest call first.
   * @param scriptStackTraceElements scriptStackTraceElements or {@code null} for none
   */
  public ExecutionError setScriptStackTraceElements(java.util.List<ScriptStackTraceElement> scriptStackTraceElements) {
    this.scriptStackTraceElements = scriptStackTraceElements;
    return this;
  }

  @Override
  public ExecutionError set(String fieldName, Object value) {
    return (ExecutionError) super.set(fieldName, value);
  }

  @Override
  public ExecutionError clone() {
    return (ExecutionError) super.clone();
  }

}
