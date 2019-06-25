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
 * Represents an interaction between a user and an item.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class Interaction extends com.google.api.client.json.GenericJson {

  /**
   * The time when the user acted on the item.  If multiple actions of the same type exist for a
   * single user, only the most recent action is recorded.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private String interactionTime;

  /**
   * The user that acted on the item.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private Principal principal;

  /**
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String type;

  /**
   * The time when the user acted on the item.  If multiple actions of the same type exist for a
   * single user, only the most recent action is recorded.
   * @return value or {@code null} for none
   */
  public String getInteractionTime() {
    return interactionTime;
  }

  /**
   * The time when the user acted on the item.  If multiple actions of the same type exist for a
   * single user, only the most recent action is recorded.
   * @param interactionTime interactionTime or {@code null} for none
   */
  public Interaction setInteractionTime(String interactionTime) {
    this.interactionTime = interactionTime;
    return this;
  }

  /**
   * The user that acted on the item.
   * @return value or {@code null} for none
   */
  public Principal getPrincipal() {
    return principal;
  }

  /**
   * The user that acted on the item.
   * @param principal principal or {@code null} for none
   */
  public Interaction setPrincipal(Principal principal) {
    this.principal = principal;
    return this;
  }

  /**
   * @return value or {@code null} for none
   */
  public java.lang.String getType() {
    return type;
  }

  /**
   * @param type type or {@code null} for none
   */
  public Interaction setType(java.lang.String type) {
    this.type = type;
    return this;
  }

  @Override
  public Interaction set(String fieldName, Object value) {
    return (Interaction) super.set(fieldName, value);
  }

  @Override
  public Interaction clone() {
    return (Interaction) super.clone();
  }

}
