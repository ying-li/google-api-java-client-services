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
 * Request of suggest API.
 *
 * <p> This is the Java data model class that specifies how to parse/serialize into the JSON that is
 * transmitted over HTTP when working with the Cloud Search API. For a detailed explanation see:
 * <a href="https://developers.google.com/api-client-library/java/google-http-java-client/json">https://developers.google.com/api-client-library/java/google-http-java-client/json</a>
 * </p>
 *
 * @author Google, Inc.
 */
@SuppressWarnings("javadoc")
public final class SuggestRequest extends com.google.api.client.json.GenericJson {

  /**
   * The sources to use for suggestions. If not specified, all data sources from the current search
   * application are used. Suggestions are based on Gmail titles. Suggestions from third party
   * sources are not available.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.util.List<DataSourceRestriction> dataSourceRestrictions;

  static {
    // hack to force ProGuard to consider DataSourceRestriction used, since otherwise it would be stripped out
    // see https://github.com/google/google-api-java-client/issues/543
    com.google.api.client.util.Data.nullOf(DataSourceRestriction.class);
  }

  /**
   * Partial query for which autocomplete suggestions will be shown. For example, if the query is
   * "sea", then the server might return "season", "search", "seagull" and so on.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private java.lang.String query;

  /**
   * Request options, such as the search application and user timezone.
   * The value may be {@code null}.
   */
  @com.google.api.client.util.Key
  private RequestOptions requestOptions;

  /**
   * The sources to use for suggestions. If not specified, all data sources from the current search
   * application are used. Suggestions are based on Gmail titles. Suggestions from third party
   * sources are not available.
   * @return value or {@code null} for none
   */
  public java.util.List<DataSourceRestriction> getDataSourceRestrictions() {
    return dataSourceRestrictions;
  }

  /**
   * The sources to use for suggestions. If not specified, all data sources from the current search
   * application are used. Suggestions are based on Gmail titles. Suggestions from third party
   * sources are not available.
   * @param dataSourceRestrictions dataSourceRestrictions or {@code null} for none
   */
  public SuggestRequest setDataSourceRestrictions(java.util.List<DataSourceRestriction> dataSourceRestrictions) {
    this.dataSourceRestrictions = dataSourceRestrictions;
    return this;
  }

  /**
   * Partial query for which autocomplete suggestions will be shown. For example, if the query is
   * "sea", then the server might return "season", "search", "seagull" and so on.
   * @return value or {@code null} for none
   */
  public java.lang.String getQuery() {
    return query;
  }

  /**
   * Partial query for which autocomplete suggestions will be shown. For example, if the query is
   * "sea", then the server might return "season", "search", "seagull" and so on.
   * @param query query or {@code null} for none
   */
  public SuggestRequest setQuery(java.lang.String query) {
    this.query = query;
    return this;
  }

  /**
   * Request options, such as the search application and user timezone.
   * @return value or {@code null} for none
   */
  public RequestOptions getRequestOptions() {
    return requestOptions;
  }

  /**
   * Request options, such as the search application and user timezone.
   * @param requestOptions requestOptions or {@code null} for none
   */
  public SuggestRequest setRequestOptions(RequestOptions requestOptions) {
    this.requestOptions = requestOptions;
    return this;
  }

  @Override
  public SuggestRequest set(String fieldName, Object value) {
    return (SuggestRequest) super.set(fieldName, value);
  }

  @Override
  public SuggestRequest clone() {
    return (SuggestRequest) super.clone();
  }

}
