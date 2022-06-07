/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataconnectivity.model;

/**
 * The information about connectivity validation results
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20210217")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ConnectivityValidation.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ConnectivityValidation {
    @Deprecated
    @java.beans.ConstructorProperties({
        "totalMessageCount",
        "errorMessageCount",
        "warnMessageCount",
        "infoMessageCount",
        "validationMessages"
    })
    public ConnectivityValidation(
            Integer totalMessageCount,
            Integer errorMessageCount,
            Integer warnMessageCount,
            Integer infoMessageCount,
            java.util.Map<String, java.util.List<ValidationMessage>> validationMessages) {
        super();
        this.totalMessageCount = totalMessageCount;
        this.errorMessageCount = errorMessageCount;
        this.warnMessageCount = warnMessageCount;
        this.infoMessageCount = infoMessageCount;
        this.validationMessages = validationMessages;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
        private Integer totalMessageCount;

        public Builder totalMessageCount(Integer totalMessageCount) {
            this.totalMessageCount = totalMessageCount;
            this.__explicitlySet__.add("totalMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
        private Integer errorMessageCount;

        public Builder errorMessageCount(Integer errorMessageCount) {
            this.errorMessageCount = errorMessageCount;
            this.__explicitlySet__.add("errorMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
        private Integer warnMessageCount;

        public Builder warnMessageCount(Integer warnMessageCount) {
            this.warnMessageCount = warnMessageCount;
            this.__explicitlySet__.add("warnMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
        private Integer infoMessageCount;

        public Builder infoMessageCount(Integer infoMessageCount) {
            this.infoMessageCount = infoMessageCount;
            this.__explicitlySet__.add("infoMessageCount");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
        private java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

        public Builder validationMessages(
                java.util.Map<String, java.util.List<ValidationMessage>> validationMessages) {
            this.validationMessages = validationMessages;
            this.__explicitlySet__.add("validationMessages");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ConnectivityValidation build() {
            ConnectivityValidation __instance__ =
                    new ConnectivityValidation(
                            totalMessageCount,
                            errorMessageCount,
                            warnMessageCount,
                            infoMessageCount,
                            validationMessages);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ConnectivityValidation o) {
            Builder copiedBuilder =
                    totalMessageCount(o.getTotalMessageCount())
                            .errorMessageCount(o.getErrorMessageCount())
                            .warnMessageCount(o.getWarnMessageCount())
                            .infoMessageCount(o.getInfoMessageCount())
                            .validationMessages(o.getValidationMessages());

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
     * Total number of validation messages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("totalMessageCount")
    private final Integer totalMessageCount;

    public Integer getTotalMessageCount() {
        return totalMessageCount;
    }

    /**
     * Total number of validation error messages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("errorMessageCount")
    private final Integer errorMessageCount;

    public Integer getErrorMessageCount() {
        return errorMessageCount;
    }

    /**
     * Total number of validation warning messages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("warnMessageCount")
    private final Integer warnMessageCount;

    public Integer getWarnMessageCount() {
        return warnMessageCount;
    }

    /**
     * Total number of validation information messages
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("infoMessageCount")
    private final Integer infoMessageCount;

    public Integer getInfoMessageCount() {
        return infoMessageCount;
    }

    /**
     * Detailed information of the connectivity validation.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("validationMessages")
    private final java.util.Map<String, java.util.List<ValidationMessage>> validationMessages;

    public java.util.Map<String, java.util.List<ValidationMessage>> getValidationMessages() {
        return validationMessages;
    }

    @Override
    public String toString() {
        java.lang.StringBuilder sb = new java.lang.StringBuilder();
        sb.append("ConnectivityValidation(");
        sb.append("totalMessageCount=").append(String.valueOf(this.totalMessageCount));
        sb.append(", errorMessageCount=").append(String.valueOf(this.errorMessageCount));
        sb.append(", warnMessageCount=").append(String.valueOf(this.warnMessageCount));
        sb.append(", infoMessageCount=").append(String.valueOf(this.infoMessageCount));
        sb.append(", validationMessages=").append(String.valueOf(this.validationMessages));
        sb.append("__explicitlySet__=").append(String.valueOf(this.__explicitlySet__));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ConnectivityValidation)) {
            return false;
        }

        ConnectivityValidation other = (ConnectivityValidation) o;
        return java.util.Objects.equals(this.totalMessageCount, other.totalMessageCount)
                && java.util.Objects.equals(this.errorMessageCount, other.errorMessageCount)
                && java.util.Objects.equals(this.warnMessageCount, other.warnMessageCount)
                && java.util.Objects.equals(this.infoMessageCount, other.infoMessageCount)
                && java.util.Objects.equals(this.validationMessages, other.validationMessages)
                && java.util.Objects.equals(this.__explicitlySet__, other.__explicitlySet__);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.totalMessageCount == null ? 43 : this.totalMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.errorMessageCount == null ? 43 : this.errorMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.warnMessageCount == null ? 43 : this.warnMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.infoMessageCount == null ? 43 : this.infoMessageCount.hashCode());
        result =
                (result * PRIME)
                        + (this.validationMessages == null
                                ? 43
                                : this.validationMessages.hashCode());
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
