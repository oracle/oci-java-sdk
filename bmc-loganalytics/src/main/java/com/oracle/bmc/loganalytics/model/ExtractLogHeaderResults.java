/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.loganalytics.model;

/**
 * log header values
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200601")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExtractLogHeaderResults.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExtractLogHeaderResults {
    @Deprecated
    @java.beans.ConstructorProperties({"jsonPaths", "xmlPaths", "headerPaths"})
    public ExtractLogHeaderResults(
            java.util.List<ExtractLogHeaderDetails> jsonPaths,
            java.util.List<String> xmlPaths,
            java.util.List<String> headerPaths) {
        super();
        this.jsonPaths = jsonPaths;
        this.xmlPaths = xmlPaths;
        this.headerPaths = headerPaths;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The log header json paths.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("jsonPaths")
        private java.util.List<ExtractLogHeaderDetails> jsonPaths;

        /**
         * The log header json paths.
         * @param jsonPaths the value to set
         * @return this builder
         **/
        public Builder jsonPaths(java.util.List<ExtractLogHeaderDetails> jsonPaths) {
            this.jsonPaths = jsonPaths;
            this.__explicitlySet__.add("jsonPaths");
            return this;
        }
        /**
         * The log field or log header values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("xmlPaths")
        private java.util.List<String> xmlPaths;

        /**
         * The log field or log header values.
         * @param xmlPaths the value to set
         * @return this builder
         **/
        public Builder xmlPaths(java.util.List<String> xmlPaths) {
            this.xmlPaths = xmlPaths;
            this.__explicitlySet__.add("xmlPaths");
            return this;
        }
        /**
         * The log header values.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("headerPaths")
        private java.util.List<String> headerPaths;

        /**
         * The log header values.
         * @param headerPaths the value to set
         * @return this builder
         **/
        public Builder headerPaths(java.util.List<String> headerPaths) {
            this.headerPaths = headerPaths;
            this.__explicitlySet__.add("headerPaths");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExtractLogHeaderResults build() {
            ExtractLogHeaderResults __instance__ =
                    new ExtractLogHeaderResults(jsonPaths, xmlPaths, headerPaths);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExtractLogHeaderResults o) {
            Builder copiedBuilder =
                    jsonPaths(o.getJsonPaths())
                            .xmlPaths(o.getXmlPaths())
                            .headerPaths(o.getHeaderPaths());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    public Builder toBuilder() {
        return new Builder().copy(this);
    }

    /**
     * The log header json paths.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("jsonPaths")
    private final java.util.List<ExtractLogHeaderDetails> jsonPaths;

    /**
     * The log header json paths.
     * @return the value
     **/
    public java.util.List<ExtractLogHeaderDetails> getJsonPaths() {
        return jsonPaths;
    }

    /**
     * The log field or log header values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("xmlPaths")
    private final java.util.List<String> xmlPaths;

    /**
     * The log field or log header values.
     * @return the value
     **/
    public java.util.List<String> getXmlPaths() {
        return xmlPaths;
    }

    /**
     * The log header values.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("headerPaths")
    private final java.util.List<String> headerPaths;

    /**
     * The log header values.
     * @return the value
     **/
    public java.util.List<String> getHeaderPaths() {
        return headerPaths;
    }

    @Override
    public String toString() {
        return this.toString(true);
    }

    /**
     * Return a string representation of the object.
     * @param includeByteArrayContents true to include the full contents of byte arrays
     * @return string representation
     */
    public String toString(boolean includeByteArrayContents) {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ExtractLogHeaderResults(");
        sb.append("jsonPaths=").append(String.valueOf(this.jsonPaths));
        sb.append(", xmlPaths=").append(String.valueOf(this.xmlPaths));
        sb.append(", headerPaths=").append(String.valueOf(this.headerPaths));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExtractLogHeaderResults)) {
            return false;
        }

        ExtractLogHeaderResults other = (ExtractLogHeaderResults) o;
        return java.util.Objects.equals(this.jsonPaths, other.jsonPaths)
                && java.util.Objects.equals(this.xmlPaths, other.xmlPaths)
                && java.util.Objects.equals(this.headerPaths, other.headerPaths)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.jsonPaths == null ? 43 : this.jsonPaths.hashCode());
        result = (result * PRIME) + (this.xmlPaths == null ? 43 : this.xmlPaths.hashCode());
        result = (result * PRIME) + (this.headerPaths == null ? 43 : this.headerPaths.hashCode());
        result =
                (result * PRIME)
                        + (this.__explicitlySet__ == null ? 43 : this.__explicitlySet__.hashCode());
        return result;
    }

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

    public java.util.Set<String> get__explicitlySet__() {
        return this.__explicitlySet__;
    }
}
