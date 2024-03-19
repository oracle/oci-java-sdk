/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.ailanguage.model;

/**
 * training model details <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20221001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ConfigurationDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ConfigurationDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"configurationMap"})
    public ConfigurationDetails(java.util.Map<String, String> configurationMap) {
        super();
        this.configurationMap = configurationMap;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * model configuration details For PII : ConfigurationDetails will be PiiEntityMasking can
         * be anyone of the following ex.{ "mode" : "MASK","maskingCharacter" :
         * "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true } { "mode" :
         * "MASK","replaceWith" : "&" } { "mode" : "REPLACE" } For language translation : {
         * "languageCodes" : ["cs", "ar"]} Language code supported Automatically detect language -
         * auto Arabic - ar Brazilian Portuguese - pt-BR Czech - cs Danish - da Dutch - nl English -
         * en Finnish - fi French - fr Canadian French - fr-CA German - de Italian - it Japanese -
         * ja Korean - ko Norwegian - no Polish - pl Romanian - ro Simplified Chinese - zh-CN
         * Spanish - es Swedish - sv Traditional Chinese - zh-TW Turkish - tr Greek - el Hebrew - he
         */
        @com.fasterxml.jackson.annotation.JsonProperty("configurationMap")
        private java.util.Map<String, String> configurationMap;

        /**
         * model configuration details For PII : ConfigurationDetails will be PiiEntityMasking can
         * be anyone of the following ex.{ "mode" : "MASK","maskingCharacter" :
         * "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true } { "mode" :
         * "MASK","replaceWith" : "&" } { "mode" : "REPLACE" } For language translation : {
         * "languageCodes" : ["cs", "ar"]} Language code supported Automatically detect language -
         * auto Arabic - ar Brazilian Portuguese - pt-BR Czech - cs Danish - da Dutch - nl English -
         * en Finnish - fi French - fr Canadian French - fr-CA German - de Italian - it Japanese -
         * ja Korean - ko Norwegian - no Polish - pl Romanian - ro Simplified Chinese - zh-CN
         * Spanish - es Swedish - sv Traditional Chinese - zh-TW Turkish - tr Greek - el Hebrew - he
         *
         * @param configurationMap the value to set
         * @return this builder
         */
        public Builder configurationMap(java.util.Map<String, String> configurationMap) {
            this.configurationMap = configurationMap;
            this.__explicitlySet__.add("configurationMap");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConfigurationDetails build() {
            ConfigurationDetails model = new ConfigurationDetails(this.configurationMap);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConfigurationDetails model) {
            if (model.wasPropertyExplicitlySet("configurationMap")) {
                this.configurationMap(model.getConfigurationMap());
            }
            return this;
        }
    }

    /** Create a new builder. */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * model configuration details For PII : ConfigurationDetails will be PiiEntityMasking can be
     * anyone of the following ex.{ "mode" : "MASK","maskingCharacter" :
     * "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true } { "mode" : "MASK","replaceWith"
     * : "&" } { "mode" : "REPLACE" } For language translation : { "languageCodes" : ["cs", "ar"]}
     * Language code supported Automatically detect language - auto Arabic - ar Brazilian Portuguese
     * - pt-BR Czech - cs Danish - da Dutch - nl English - en Finnish - fi French - fr Canadian
     * French - fr-CA German - de Italian - it Japanese - ja Korean - ko Norwegian - no Polish - pl
     * Romanian - ro Simplified Chinese - zh-CN Spanish - es Swedish - sv Traditional Chinese -
     * zh-TW Turkish - tr Greek - el Hebrew - he
     */
    @com.fasterxml.jackson.annotation.JsonProperty("configurationMap")
    private final java.util.Map<String, String> configurationMap;

    /**
     * model configuration details For PII : ConfigurationDetails will be PiiEntityMasking can be
     * anyone of the following ex.{ "mode" : "MASK","maskingCharacter" :
     * "&","leaveCharactersUnmasked": 3,"isUnmaskedFromEnd" : true } { "mode" : "MASK","replaceWith"
     * : "&" } { "mode" : "REPLACE" } For language translation : { "languageCodes" : ["cs", "ar"]}
     * Language code supported Automatically detect language - auto Arabic - ar Brazilian Portuguese
     * - pt-BR Czech - cs Danish - da Dutch - nl English - en Finnish - fi French - fr Canadian
     * French - fr-CA German - de Italian - it Japanese - ja Korean - ko Norwegian - no Polish - pl
     * Romanian - ro Simplified Chinese - zh-CN Spanish - es Swedish - sv Traditional Chinese -
     * zh-TW Turkish - tr Greek - el Hebrew - he
     *
     * @return the value
     */
    public java.util.Map<String, String> getConfigurationMap() {
        return configurationMap;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     *
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConfigurationDetails(");
        sb.append("super=").append(super.toString());
        sb.append("configurationMap=").append(String.valueOf(this.configurationMap));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConfigurationDetails)) {
            return false;
        }

        ConfigurationDetails other = (ConfigurationDetails) o;
        return java.util.Objects.equals(this.configurationMap, other.configurationMap)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.configurationMap == null ? 43 : this.configurationMap.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
