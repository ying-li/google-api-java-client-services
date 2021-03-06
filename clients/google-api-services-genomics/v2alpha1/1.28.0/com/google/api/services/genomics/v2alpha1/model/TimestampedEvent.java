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

package com.google.api.services.genomics.v2alpha1.model;

/**
 * An event that occured in the operation assigned to the worker and the time of occurance.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Genomics API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class TimestampedEvent extends com.google.api.client.json.GenericJson {

  /**
   * The event data.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.Map<String, java.lang.Object> data;

  /**
   * The time when the event happened.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestamp;

  /**
   * The event data.
   * @return value or {@code null} for none
   */
  public java.util.Map<String, java.lang.Object> getData() {
    return data;
  }

  /**
   * The event data.
   * @param data data or {@code null} for none
   */
  public TimestampedEvent setData(java.util.Map<String, java.lang.Object> data) {
    this.data = data;
    return this;
  }

  /**
   * The time when the event happened.
   * @return value or {@code null} for none
   */
  public String getTimestamp() {
    return timestamp;
  }

  /**
   * The time when the event happened.
   * @param timestamp timestamp or {@code null} for none
   */
  public TimestampedEvent setTimestamp(String timestamp) {
    this.timestamp = timestamp;
    return this;
  }

  @Override
  public TimestampedEvent set(String fieldName, Object value) {
    return (TimestampedEvent) super.set(fieldName, value);
  }

  @Override
  public TimestampedEvent clone() {
    return (TimestampedEvent) super.clone();
  }

}
