/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.delegateaccesscontrol.model;

/**
 * Details of the resources that this Delegation Control is applicable to. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DelegationControlResourceSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DelegationControlResourceSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"id", "resourceStatus"})
    public DelegationControlResourceSummary(String id, ResourceStatus resourceStatus) {
        super();
        this.id = id;
        this.resourceStatus = resourceStatus;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the resource. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * OCID of the resource.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The current status of the resource in Delegation Control. */
        @com.fasterxml.jackson.annotation.JsonProperty("resourceStatus")
        private ResourceStatus resourceStatus;

        /**
         * The current status of the resource in Delegation Control.
         *
         * @param resourceStatus the value to set
         * @return this builder
         */
        public Builder resourceStatus(ResourceStatus resourceStatus) {
            this.resourceStatus = resourceStatus;
            this.__explicitlySet__.add("resourceStatus");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DelegationControlResourceSummary build() {
            DelegationControlResourceSummary model =
                    new DelegationControlResourceSummary(this.id, this.resourceStatus);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DelegationControlResourceSummary model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("resourceStatus")) {
                this.resourceStatus(model.getResourceStatus());
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

    /** OCID of the resource. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * OCID of the resource.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The current status of the resource in Delegation Control. */
    public enum ResourceStatus implements com.oracle.bmc.http.internal.BmcEnum {
        Created("CREATED"),
        Applying("APPLYING"),
        Applied("APPLIED"),
        ApplyFailed("APPLY_FAILED"),
        Updating("UPDATING"),
        UpdateFailed("UPDATE_FAILED"),
        Deleting("DELETING"),
        Deleted("DELETED"),
        DeletionFailed("DELETION_FAILED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(ResourceStatus.class);

        private final String value;
        private static java.util.Map<String, ResourceStatus> map;

        static {
            map = new java.util.HashMap<>();
            for (ResourceStatus v : ResourceStatus.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        ResourceStatus(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static ResourceStatus create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'ResourceStatus', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /** The current status of the resource in Delegation Control. */
    @com.fasterxml.jackson.annotation.JsonProperty("resourceStatus")
    private final ResourceStatus resourceStatus;

    /**
     * The current status of the resource in Delegation Control.
     *
     * @return the value
     */
    public ResourceStatus getResourceStatus() {
        return resourceStatus;
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
        sb.append("DelegationControlResourceSummary(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", resourceStatus=").append(String.valueOf(this.resourceStatus));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DelegationControlResourceSummary)) {
            return false;
        }

        DelegationControlResourceSummary other = (DelegationControlResourceSummary) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.resourceStatus, other.resourceStatus)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.resourceStatus == null ? 43 : this.resourceStatus.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
