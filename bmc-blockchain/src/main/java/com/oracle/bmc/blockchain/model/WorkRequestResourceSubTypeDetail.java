/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.blockchain.model;

/**
 * SubType information for a work request resource.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20191010")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = WorkRequestResourceSubTypeDetail.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class WorkRequestResourceSubTypeDetail
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"subType", "subTypeKey", "subTypeStatus"})
    public WorkRequestResourceSubTypeDetail(
            String subType, String subTypeKey, SubTypeStatus subTypeStatus) {
        super();
        this.subType = subType;
        this.subTypeKey = subTypeKey;
        this.subTypeStatus = subTypeStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Subtype of the work request resource like osn or peer.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subType")
        private String subType;

        /**
         * Subtype of the work request resource like osn or peer.
         *
         * @param subType the value to set
         * @return this builder
         **/
        public Builder subType(String subType) {
            this.subType = subType;
            this.__explicitlySet__.add("subType");
            return this;
        }
        /**
         * The identifier of the resource subType.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subTypeKey")
        private String subTypeKey;

        /**
         * The identifier of the resource subType.
         * @param subTypeKey the value to set
         * @return this builder
         **/
        public Builder subTypeKey(String subTypeKey) {
            this.subTypeKey = subTypeKey;
            this.__explicitlySet__.add("subTypeKey");
            return this;
        }
        /**
         * Status of the resource subType, as a result of the work tracked in this work request.
         * A resource subType would be CREATED, UPDATED or DELETED, after the work request is completed.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("subTypeStatus")
        private SubTypeStatus subTypeStatus;

        /**
         * Status of the resource subType, as a result of the work tracked in this work request.
         * A resource subType would be CREATED, UPDATED or DELETED, after the work request is completed.
         *
         * @param subTypeStatus the value to set
         * @return this builder
         **/
        public Builder subTypeStatus(SubTypeStatus subTypeStatus) {
            this.subTypeStatus = subTypeStatus;
            this.__explicitlySet__.add("subTypeStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public WorkRequestResourceSubTypeDetail build() {
            WorkRequestResourceSubTypeDetail model =
                    new WorkRequestResourceSubTypeDetail(
                            this.subType, this.subTypeKey, this.subTypeStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(WorkRequestResourceSubTypeDetail model) {
            if (model.wasPropertyExplicitlySet("subType")) {
                this.subType(model.getSubType());
            }
            if (model.wasPropertyExplicitlySet("subTypeKey")) {
                this.subTypeKey(model.getSubTypeKey());
            }
            if (model.wasPropertyExplicitlySet("subTypeStatus")) {
                this.subTypeStatus(model.getSubTypeStatus());
            }
            return this;
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
     * Subtype of the work request resource like osn or peer.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subType")
    private final String subType;

    /**
     * Subtype of the work request resource like osn or peer.
     *
     * @return the value
     **/
    public String getSubType() {
        return subType;
    }

    /**
     * The identifier of the resource subType.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subTypeKey")
    private final String subTypeKey;

    /**
     * The identifier of the resource subType.
     * @return the value
     **/
    public String getSubTypeKey() {
        return subTypeKey;
    }

    /**
     * Status of the resource subType, as a result of the work tracked in this work request.
     * A resource subType would be CREATED, UPDATED or DELETED, after the work request is completed.
     *
     **/
    public enum SubTypeStatus {
        Created("CREATED"),
        Updated("UPDATED"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(SubTypeStatus.class);

        private final String value;
        private static java.util.Map<String, SubTypeStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (SubTypeStatus v : SubTypeStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        SubTypeStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static SubTypeStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'SubTypeStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Status of the resource subType, as a result of the work tracked in this work request.
     * A resource subType would be CREATED, UPDATED or DELETED, after the work request is completed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("subTypeStatus")
    private final SubTypeStatus subTypeStatus;

    /**
     * Status of the resource subType, as a result of the work tracked in this work request.
     * A resource subType would be CREATED, UPDATED or DELETED, after the work request is completed.
     *
     * @return the value
     **/
    public SubTypeStatus getSubTypeStatus() {
        return subTypeStatus;
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
        sb.append("WorkRequestResourceSubTypeDetail(");
        sb.append("super=").append(super.toString());
        sb.append("subType=").append(String.valueOf(this.subType));
        sb.append(", subTypeKey=").append(String.valueOf(this.subTypeKey));
        sb.append(", subTypeStatus=").append(String.valueOf(this.subTypeStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WorkRequestResourceSubTypeDetail)) {
            return false;
        }

        WorkRequestResourceSubTypeDetail other = (WorkRequestResourceSubTypeDetail) o;
        return java.util.Objects.equals(this.subType, other.subType)
                && java.util.Objects.equals(this.subTypeKey, other.subTypeKey)
                && java.util.Objects.equals(this.subTypeStatus, other.subTypeStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.subType == null ? 43 : this.subType.hashCode());
        result = (result * PRIME) + (this.subTypeKey == null ? 43 : this.subTypeKey.hashCode());
        result =
                (result * PRIME)
                        + (this.subTypeStatus == null ? 43 : this.subTypeStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
