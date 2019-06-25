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

package com.google.api.services.cloudsearch.v1.model;

/**
 * Definition of a single value with generic type.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Value extends com.google.api.client.json.GenericJson {

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean booleanValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Date dateValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Double doubleValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key @com.google.api.client.json.JsonString
  private java.lang.Long integerValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String stringValue;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String timestampValue;

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getBooleanValue() {
    return booleanValue;
  }

  /**
   * @param booleanValue booleanValue or {@code null} for none
   */
  public Value setBooleanValue(java.lang.Boolean booleanValue) {
    this.booleanValue = booleanValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public Date getDateValue() {
    return dateValue;
  }

  /**
   * @param dateValue dateValue or {@code null} for none
   */
  public Value setDateValue(Date dateValue) {
    this.dateValue = dateValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Double getDoubleValue() {
    return doubleValue;
  }

  /**
   * @param doubleValue doubleValue or {@code null} for none
   */
  public Value setDoubleValue(java.lang.Double doubleValue) {
    this.doubleValue = doubleValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.Long getIntegerValue() {
    return integerValue;
  }

  /**
   * @param integerValue integerValue or {@code null} for none
   */
  public Value setIntegerValue(java.lang.Long integerValue) {
    this.integerValue = integerValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getStringValue() {
    return stringValue;
  }

  /**
   * @param stringValue stringValue or {@code null} for none
   */
  public Value setStringValue(java.lang.String stringValue) {
    this.stringValue = stringValue;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public String getTimestampValue() {
    return timestampValue;
  }

  /**
   * @param timestampValue timestampValue or {@code null} for none
   */
  public Value setTimestampValue(String timestampValue) {
    this.timestampValue = timestampValue;
    return this;
  }

  @Override
  public Value set(String fieldName, Object value) {
    return (Value) super.set(fieldName, value);
  }

  @Override
  public Value clone() {
    return (Value) super.clone();
  }

}
