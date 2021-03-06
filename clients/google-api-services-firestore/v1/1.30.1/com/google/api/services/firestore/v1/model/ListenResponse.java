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

package com.google.api.services.firestore.v1.model;

/**
 * The response for Firestore.Listen.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Firestore API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class ListenResponse extends com.google.api.client.json.GenericJson {

  /**
   * A Document has changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentChange documentChange;

  /**
   * A Document has been deleted.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentDelete documentDelete;

  /**
   * A Document has been removed from a target (because it is no longer relevant to that target).
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private DocumentRemove documentRemove;

  /**
   * A filter to apply to the set of documents previously returned for the given target. Returned
   * when documents may have been removed from the given target, but the exact documents are
   * unknown.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private ExistenceFilter filter;

  /**
   * Targets have changed.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private TargetChange targetChange;

  /**
   * A Document has changed.
   * @return value or {@code null} for none
   */
  public DocumentChange getDocumentChange() {
    return documentChange;
  }

  /**
   * A Document has changed.
   * @param documentChange documentChange or {@code null} for none
   */
  public ListenResponse setDocumentChange(DocumentChange documentChange) {
    this.documentChange = documentChange;
    return this;
  }

  /**
   * A Document has been deleted.
   * @return value or {@code null} for none
   */
  public DocumentDelete getDocumentDelete() {
    return documentDelete;
  }

  /**
   * A Document has been deleted.
   * @param documentDelete documentDelete or {@code null} for none
   */
  public ListenResponse setDocumentDelete(DocumentDelete documentDelete) {
    this.documentDelete = documentDelete;
    return this;
  }

  /**
   * A Document has been removed from a target (because it is no longer relevant to that target).
   * @return value or {@code null} for none
   */
  public DocumentRemove getDocumentRemove() {
    return documentRemove;
  }

  /**
   * A Document has been removed from a target (because it is no longer relevant to that target).
   * @param documentRemove documentRemove or {@code null} for none
   */
  public ListenResponse setDocumentRemove(DocumentRemove documentRemove) {
    this.documentRemove = documentRemove;
    return this;
  }

  /**
   * A filter to apply to the set of documents previously returned for the given target. Returned
   * when documents may have been removed from the given target, but the exact documents are
   * unknown.
   * @return value or {@code null} for none
   */
  public ExistenceFilter getFilter() {
    return filter;
  }

  /**
   * A filter to apply to the set of documents previously returned for the given target. Returned
   * when documents may have been removed from the given target, but the exact documents are
   * unknown.
   * @param filter filter or {@code null} for none
   */
  public ListenResponse setFilter(ExistenceFilter filter) {
    this.filter = filter;
    return this;
  }

  /**
   * Targets have changed.
   * @return value or {@code null} for none
   */
  public TargetChange getTargetChange() {
    return targetChange;
  }

  /**
   * Targets have changed.
   * @param targetChange targetChange or {@code null} for none
   */
  public ListenResponse setTargetChange(TargetChange targetChange) {
    this.targetChange = targetChange;
    return this;
  }

  @Override
  public ListenResponse set(String fieldName, Object value) {
    return (ListenResponse) super.set(fieldName, value);
  }

  @Override
  public ListenResponse clone() {
    return (ListenResponse) super.clone();
  }

}
