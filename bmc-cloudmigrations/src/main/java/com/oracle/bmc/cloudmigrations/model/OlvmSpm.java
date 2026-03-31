/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudmigrations.model;

/**
 * The host storage pool manager (SPM) status and definition. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220919")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmSpm.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmSpm extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"priority", "spmStatus"})
    public OlvmSpm(Integer priority, SpmStatus spmStatus) {
        super();
        this.priority = priority;
        this.spmStatus = spmStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Priority of this SPM. */
        @com.fasterxml.jackson.annotation.JsonProperty("priority")
        private Integer priority;

        /**
         * Priority of this SPM.
         *
         * @param priority the value to set
         * @return this builder
         */
        public Builder priority(Integer priority) {
            this.priority = priority;
            this.__explicitlySet__.add("priority");
            return this;
        }
        /** Status of this SPM. */
        @com.fasterxml.jackson.annotation.JsonProperty("spmStatus")
        private SpmStatus spmStatus;

        /**
         * Status of this SPM.
         *
         * @param spmStatus the value to set
         * @return this builder
         */
        public Builder spmStatus(SpmStatus spmStatus) {
            this.spmStatus = spmStatus;
            this.__explicitlySet__.add("spmStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmSpm build() {
            OlvmSpm model = new OlvmSpm(this.priority, this.spmStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmSpm model) {
            if (model.wasPropertyExplicitlySet("priority")) {
                this.priority(model.getPriority());
            }
            if (model.wasPropertyExplicitlySet("spmStatus")) {
                this.spmStatus(model.getSpmStatus());
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

    /** Priority of this SPM. */
    @com.fasterxml.jackson.annotation.JsonProperty("priority")
    private final Integer priority;

    /**
     * Priority of this SPM.
     *
     * @return the value
     */
    public Integer getPriority() {
        return priority;
    }

    /** Status of this SPM. */
    public enum SpmStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Contending("CONTENDING"),
        None("NONE"),
        Spm("SPM"),
        ;

        private final String value;
        private static java.util.Map<String, SpmStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (SpmStatus v : SpmStatus.values()) {
                map.put(v.getValue(), v);
            }
        }

        SpmStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SpmStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid SpmStatus: " + key);
        }
    };
    /** Status of this SPM. */
    @com.fasterxml.jackson.annotation.JsonProperty("spmStatus")
    private final SpmStatus spmStatus;

    /**
     * Status of this SPM.
     *
     * @return the value
     */
    public SpmStatus getSpmStatus() {
        return spmStatus;
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
        sb.append("OlvmSpm(");
        sb.append("super=").append(super.toString());
        sb.append("priority=").append(String.valueOf(this.priority));
        sb.append(", spmStatus=").append(String.valueOf(this.spmStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmSpm)) {
            return false;
        }

        OlvmSpm other = (OlvmSpm) o;
        return java.util.Objects.equals(this.priority, other.priority)
                && java.util.Objects.equals(this.spmStatus, other.spmStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.priority == null ? 43 : this.priority.hashCode());
        result = (result * PRIME) + (this.spmStatus == null ? 43 : this.spmStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
