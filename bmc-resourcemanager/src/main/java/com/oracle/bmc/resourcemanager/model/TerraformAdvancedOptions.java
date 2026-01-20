/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.resourcemanager.model;

/**
 * Specifies advanced options for Terraform commands. These options are not necessary for normal
 * usage of Terraform. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180917")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = TerraformAdvancedOptions.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class TerraformAdvancedOptions
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"isRefreshRequired", "parallelism", "detailedLogLevel"})
    public TerraformAdvancedOptions(
            Boolean isRefreshRequired, Integer parallelism, DetailedLogLevel detailedLogLevel) {
        super();
        this.isRefreshRequired = isRefreshRequired;
        this.parallelism = parallelism;
        this.detailedLogLevel = detailedLogLevel;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Specifies whether to refresh the state for each resource before running the job
         * (operation). Refreshing the state can affect performance. Consider setting to {@code
         * false} if the configuration includes several resources. Used with the following
         * operations: {@code PLAN}, {@code APPLY}, {@code DESTROY}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("isRefreshRequired")
        private Boolean isRefreshRequired;

        /**
         * Specifies whether to refresh the state for each resource before running the job
         * (operation). Refreshing the state can affect performance. Consider setting to {@code
         * false} if the configuration includes several resources. Used with the following
         * operations: {@code PLAN}, {@code APPLY}, {@code DESTROY}.
         *
         * @param isRefreshRequired the value to set
         * @return this builder
         */
        public Builder isRefreshRequired(Boolean isRefreshRequired) {
            this.isRefreshRequired = isRefreshRequired;
            this.__explicitlySet__.add("isRefreshRequired");
            return this;
        }
        /**
         * Limits the number of concurrent Terraform operations when [walking the
         * graph](https://www.terraform.io/docs/internals/graph.html#walking-the-graph). Use this
         * parameter to help debug Terraform issues or to accomplish certain special use cases. A
         * higher value might cause resources to be throttled. Used with the following operations:
         * {@code PLAN}, {@code APPLY}, {@code DESTROY}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("parallelism")
        private Integer parallelism;

        /**
         * Limits the number of concurrent Terraform operations when [walking the
         * graph](https://www.terraform.io/docs/internals/graph.html#walking-the-graph). Use this
         * parameter to help debug Terraform issues or to accomplish certain special use cases. A
         * higher value might cause resources to be throttled. Used with the following operations:
         * {@code PLAN}, {@code APPLY}, {@code DESTROY}.
         *
         * @param parallelism the value to set
         * @return this builder
         */
        public Builder parallelism(Integer parallelism) {
            this.parallelism = parallelism;
            this.__explicitlySet__.add("parallelism");
            return this;
        }
        /** Enables detailed logs at the specified verbosity for running the job (operation). */
        @com.fasterxml.jackson.annotation.JsonProperty("detailedLogLevel")
        private DetailedLogLevel detailedLogLevel;

        /**
         * Enables detailed logs at the specified verbosity for running the job (operation).
         *
         * @param detailedLogLevel the value to set
         * @return this builder
         */
        public Builder detailedLogLevel(DetailedLogLevel detailedLogLevel) {
            this.detailedLogLevel = detailedLogLevel;
            this.__explicitlySet__.add("detailedLogLevel");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TerraformAdvancedOptions build() {
            TerraformAdvancedOptions model =
                    new TerraformAdvancedOptions(
                            this.isRefreshRequired, this.parallelism, this.detailedLogLevel);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TerraformAdvancedOptions model) {
            if (model.wasPropertyExplicitlySet("isRefreshRequired")) {
                this.isRefreshRequired(model.getIsRefreshRequired());
            }
            if (model.wasPropertyExplicitlySet("parallelism")) {
                this.parallelism(model.getParallelism());
            }
            if (model.wasPropertyExplicitlySet("detailedLogLevel")) {
                this.detailedLogLevel(model.getDetailedLogLevel());
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
     * Specifies whether to refresh the state for each resource before running the job (operation).
     * Refreshing the state can affect performance. Consider setting to {@code false} if the
     * configuration includes several resources. Used with the following operations: {@code PLAN},
     * {@code APPLY}, {@code DESTROY}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("isRefreshRequired")
    private final Boolean isRefreshRequired;

    /**
     * Specifies whether to refresh the state for each resource before running the job (operation).
     * Refreshing the state can affect performance. Consider setting to {@code false} if the
     * configuration includes several resources. Used with the following operations: {@code PLAN},
     * {@code APPLY}, {@code DESTROY}.
     *
     * @return the value
     */
    public Boolean getIsRefreshRequired() {
        return isRefreshRequired;
    }

    /**
     * Limits the number of concurrent Terraform operations when [walking the
     * graph](https://www.terraform.io/docs/internals/graph.html#walking-the-graph). Use this
     * parameter to help debug Terraform issues or to accomplish certain special use cases. A higher
     * value might cause resources to be throttled. Used with the following operations: {@code
     * PLAN}, {@code APPLY}, {@code DESTROY}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("parallelism")
    private final Integer parallelism;

    /**
     * Limits the number of concurrent Terraform operations when [walking the
     * graph](https://www.terraform.io/docs/internals/graph.html#walking-the-graph). Use this
     * parameter to help debug Terraform issues or to accomplish certain special use cases. A higher
     * value might cause resources to be throttled. Used with the following operations: {@code
     * PLAN}, {@code APPLY}, {@code DESTROY}.
     *
     * @return the value
     */
    public Integer getParallelism() {
        return parallelism;
    }

    /** Enables detailed logs at the specified verbosity for running the job (operation). */
    public enum DetailedLogLevel implements com.oracle.bmc.http.internal.BmcEnum {
        Error("ERROR"),
        Warn("WARN"),
        Info("INFO"),
        Debug("DEBUG"),
        Trace("TRACE"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(DetailedLogLevel.class);

        private final String value;
        private static java.util.Map<String, DetailedLogLevel> map;

        static {
            map = new java.util.HashMap<>();
            for (DetailedLogLevel v : DetailedLogLevel.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        DetailedLogLevel(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static DetailedLogLevel create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'DetailedLogLevel', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** Enables detailed logs at the specified verbosity for running the job (operation). */
    @com.fasterxml.jackson.annotation.JsonProperty("detailedLogLevel")
    private final DetailedLogLevel detailedLogLevel;

    /**
     * Enables detailed logs at the specified verbosity for running the job (operation).
     *
     * @return the value
     */
    public DetailedLogLevel getDetailedLogLevel() {
        return detailedLogLevel;
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
        sb.append("TerraformAdvancedOptions(");
        sb.append("super=").append(super.toString());
        sb.append("isRefreshRequired=").append(String.valueOf(this.isRefreshRequired));
        sb.append(", parallelism=").append(String.valueOf(this.parallelism));
        sb.append(", detailedLogLevel=").append(String.valueOf(this.detailedLogLevel));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TerraformAdvancedOptions)) {
            return false;
        }

        TerraformAdvancedOptions other = (TerraformAdvancedOptions) o;
        return java.util.Objects.equals(this.isRefreshRequired, other.isRefreshRequired)
                && java.util.Objects.equals(this.parallelism, other.parallelism)
                && java.util.Objects.equals(this.detailedLogLevel, other.detailedLogLevel)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.isRefreshRequired == null ? 43 : this.isRefreshRequired.hashCode());
        result = (result * PRIME) + (this.parallelism == null ? 43 : this.parallelism.hashCode());
        result =
                (result * PRIME)
                        + (this.detailedLogLevel == null ? 43 : this.detailedLogLevel.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
