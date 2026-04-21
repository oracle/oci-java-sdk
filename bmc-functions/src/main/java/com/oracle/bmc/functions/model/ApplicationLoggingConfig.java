/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.functions.model;

/**
 * Set logging configuration for an application. This is only used if Service Logs for the
 * application are enabled in the OCI Logging service. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20181201")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApplicationLoggingConfig.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApplicationLoggingConfig
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"lineFormat"})
    public ApplicationLoggingConfig(LineFormat lineFormat) {
        super();
        this.lineFormat = lineFormat;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Specify the format of log lines emitted by functions in this application. */
        @com.fasterxml.jackson.annotation.JsonProperty("lineFormat")
        private LineFormat lineFormat;

        /**
         * Specify the format of log lines emitted by functions in this application.
         *
         * @param lineFormat the value to set
         * @return this builder
         */
        public Builder lineFormat(LineFormat lineFormat) {
            this.lineFormat = lineFormat;
            this.__explicitlySet__.add("lineFormat");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApplicationLoggingConfig build() {
            ApplicationLoggingConfig model = new ApplicationLoggingConfig(this.lineFormat);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApplicationLoggingConfig model) {
            if (model.wasPropertyExplicitlySet("lineFormat")) {
                this.lineFormat(model.getLineFormat());
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

    /** Specify the format of log lines emitted by functions in this application. */
    public enum LineFormat implements com.oracle.bmc.http.internal.BmcEnum {
        Json("JSON"),
        PlainText("PLAIN_TEXT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LineFormat.class);

        private final String value;
        private static java.util.Map<String, LineFormat> map;

        static {
            map = new java.util.HashMap<>();
            for (LineFormat v : LineFormat.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LineFormat(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LineFormat create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LineFormat', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Specify the format of log lines emitted by functions in this application. */
    @com.fasterxml.jackson.annotation.JsonProperty("lineFormat")
    private final LineFormat lineFormat;

    /**
     * Specify the format of log lines emitted by functions in this application.
     *
     * @return the value
     */
    public LineFormat getLineFormat() {
        return lineFormat;
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
        sb.append("ApplicationLoggingConfig(");
        sb.append("super=").append(super.toString());
        sb.append("lineFormat=").append(String.valueOf(this.lineFormat));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApplicationLoggingConfig)) {
            return false;
        }

        ApplicationLoggingConfig other = (ApplicationLoggingConfig) o;
        return java.util.Objects.equals(this.lineFormat, other.lineFormat) && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.lineFormat == null ? 43 : this.lineFormat.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
