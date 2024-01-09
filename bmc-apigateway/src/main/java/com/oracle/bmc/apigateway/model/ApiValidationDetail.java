/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.apigateway.model;

/**
 * Detail of a single error or warning. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = ApiValidationDetail.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class ApiValidationDetail
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"msg", "severity", "src"})
    public ApiValidationDetail(
            String msg,
            Severity severity,
            java.util.List<java.util.List<java.math.BigDecimal>> src) {
        super();
        this.msg = msg;
        this.severity = severity;
        this.src = src;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Description of the warning/error. */
        @com.fasterxml.jackson.annotation.JsonProperty("msg")
        private String msg;

        /**
         * Description of the warning/error.
         *
         * @param msg the value to set
         * @return this builder
         */
        public Builder msg(String msg) {
            this.msg = msg;
            this.__explicitlySet__.add("msg");
            return this;
        }
        /** Severity of the issue. */
        @com.fasterxml.jackson.annotation.JsonProperty("severity")
        private Severity severity;

        /**
         * Severity of the issue.
         *
         * @param severity the value to set
         * @return this builder
         */
        public Builder severity(Severity severity) {
            this.severity = severity;
            this.__explicitlySet__.add("severity");
            return this;
        }
        /** Position of the issue in the specification file (line, column). */
        @com.fasterxml.jackson.annotation.JsonProperty("src")
        private java.util.List<java.util.List<java.math.BigDecimal>> src;

        /**
         * Position of the issue in the specification file (line, column).
         *
         * @param src the value to set
         * @return this builder
         */
        public Builder src(java.util.List<java.util.List<java.math.BigDecimal>> src) {
            this.src = src;
            this.__explicitlySet__.add("src");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ApiValidationDetail build() {
            ApiValidationDetail model = new ApiValidationDetail(this.msg, this.severity, this.src);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ApiValidationDetail model) {
            if (model.wasPropertyExplicitlySet("msg")) {
                this.msg(model.getMsg());
            }
            if (model.wasPropertyExplicitlySet("severity")) {
                this.severity(model.getSeverity());
            }
            if (model.wasPropertyExplicitlySet("src")) {
                this.src(model.getSrc());
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

    /** Description of the warning/error. */
    @com.fasterxml.jackson.annotation.JsonProperty("msg")
    private final String msg;

    /**
     * Description of the warning/error.
     *
     * @return the value
     */
    public String getMsg() {
        return msg;
    }

    /** Severity of the issue. */
    public enum Severity implements com.oracle.bmc.http.internal.BmcEnum {
        Info("INFO"),
        Warning("WARNING"),
        Error("ERROR"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(Severity.class);

        private final String value;
        private static java.util.Map<String, Severity> map;

        static {
            map = new java.util.HashMap<>();
            for (Severity v : Severity.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Severity(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Severity create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Severity', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Severity of the issue. */
    @com.fasterxml.jackson.annotation.JsonProperty("severity")
    private final Severity severity;

    /**
     * Severity of the issue.
     *
     * @return the value
     */
    public Severity getSeverity() {
        return severity;
    }

    /** Position of the issue in the specification file (line, column). */
    @com.fasterxml.jackson.annotation.JsonProperty("src")
    private final java.util.List<java.util.List<java.math.BigDecimal>> src;

    /**
     * Position of the issue in the specification file (line, column).
     *
     * @return the value
     */
    public java.util.List<java.util.List<java.math.BigDecimal>> getSrc() {
        return src;
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
        sb.append("ApiValidationDetail(");
        sb.append("super=").append(super.toString());
        sb.append("msg=").append(String.valueOf(this.msg));
        sb.append(", severity=").append(String.valueOf(this.severity));
        sb.append(", src=").append(String.valueOf(this.src));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ApiValidationDetail)) {
            return false;
        }

        ApiValidationDetail other = (ApiValidationDetail) o;
        return java.util.Objects.equals(this.msg, other.msg)
                && java.util.Objects.equals(this.severity, other.severity)
                && java.util.Objects.equals(this.src, other.src)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.msg == null ? 43 : this.msg.hashCode());
        result = (result * PRIME) + (this.severity == null ? 43 : this.severity.hashCode());
        result = (result * PRIME) + (this.src == null ? 43 : this.src.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
