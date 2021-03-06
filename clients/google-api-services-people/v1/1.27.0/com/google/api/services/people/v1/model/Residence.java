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

package com.google.api.services.people.v1.model;

/**
 * A person's past or current residence.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the People API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Residence extends com.google.api.client.json.GenericJson {

  /**
   * True if the residence is the person's current residence; false if the residence is a past
   * residence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.Boolean current;

  /**
   * Metadata about the residence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private FieldMetadata metadata;

  /**
   * The address of the residence.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String value;

  /**
   * True if the residence is the person's current residence; false if the residence is a past
   * residence.
   * @return value or {@code null} for none
   */
  public java.lang.Boolean getCurrent() {
    return current;
  }

  /**
   * True if the residence is the person's current residence; false if the residence is a past
   * residence.
   * @param current current or {@code null} for none
   */
  public Residence setCurrent(java.lang.Boolean current) {
    this.current = current;
    return this;
  }

  /**
   * Metadata about the residence.
   * @return value or {@code null} for none
   */
  public FieldMetadata getMetadata() {
    return metadata;
  }

  /**
   * Metadata about the residence.
   * @param metadata metadata or {@code null} for none
   */
  public Residence setMetadata(FieldMetadata metadata) {
    this.metadata = metadata;
    return this;
  }

  /**
   * The address of the residence.
   * @return value or {@code null} for none
   */
  public java.lang.String getValue() {
    return value;
  }

  /**
   * The address of the residence.
   * @param value value or {@code null} for none
   */
  public Residence setValue(java.lang.String value) {
    this.value = value;
    return this;
  }

  @Override
  public Residence set(String fieldName, Object value) {
    return (Residence) super.set(fieldName, value);
  }

  @Override
  public Residence clone() {
    return (Residence) super.clone();
  }

}
