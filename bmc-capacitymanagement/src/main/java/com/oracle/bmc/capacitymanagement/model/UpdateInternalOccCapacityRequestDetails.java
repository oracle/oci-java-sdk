/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.capacitymanagement.model;

/**
 * The details required for making an internal API update call for the capacity requests.
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20231107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateInternalOccCapacityRequestDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateInternalOccCapacityRequestDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"requestState", "lifecycleDetails"})
    public UpdateInternalOccCapacityRequestDetails(
            RequestState requestState, String lifecycleDetails) {
        super();
        this.requestState = requestState;
        this.lifecycleDetails = lifecycleDetails;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The subset of request states available internally for updating the capacity request.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("requestState")
        private RequestState requestState;

        /**
         * The subset of request states available internally for updating the capacity request.
         * @param requestState the value to set
         * @return this builder
         **/
        public Builder requestState(RequestState requestState) {
            this.requestState = requestState;
            this.__explicitlySet__.add("requestState");
            return this;
        }
        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
        private String lifecycleDetails;

        /**
         * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
         * @param lifecycleDetails the value to set
         * @return this builder
         **/
        public Builder lifecycleDetails(String lifecycleDetails) {
            this.lifecycleDetails = lifecycleDetails;
            this.__explicitlySet__.add("lifecycleDetails");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateInternalOccCapacityRequestDetails build() {
            UpdateInternalOccCapacityRequestDetails model =
                    new UpdateInternalOccCapacityRequestDetails(
                            this.requestState, this.lifecycleDetails);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateInternalOccCapacityRequestDetails model) {
            if (model.wasPropertyExplicitlySet("requestState")) {
                this.requestState(model.getRequestState());
            }
            if (model.wasPropertyExplicitlySet("lifecycleDetails")) {
                this.lifecycleDetails(model.getLifecycleDetails());
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
     * The subset of request states available internally for updating the capacity request.
     **/
    public enum RequestState {
        Resolved("RESOLVED"),
        Rejected("REJECTED"),
        InProgress("IN_PROGRESS"),
        ;

        private final String value;
        private static java.util.Map<String, RequestState> map;

        static {
            map = new java.util.HashMap<>();
            for (RequestState v : RequestState.values()) {
                map.put(v.getValue(), v);
            }
        }

        RequestState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static RequestState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid RequestState: " + key);
        }
    };
    /**
     * The subset of request states available internally for updating the capacity request.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("requestState")
    private final RequestState requestState;

    /**
     * The subset of request states available internally for updating the capacity request.
     * @return the value
     **/
    public RequestState getRequestState() {
        return requestState;
    }

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleDetails")
    private final String lifecycleDetails;

    /**
     * A message describing the current state in more detail. For example, can be used to provide actionable information for a resource in a Failed State.
     * @return the value
     **/
    public String getLifecycleDetails() {
        return lifecycleDetails;
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
        sb.append("UpdateInternalOccCapacityRequestDetails(");
        sb.append("super=").append(super.toString());
        sb.append("requestState=").append(String.valueOf(this.requestState));
        sb.append(", lifecycleDetails=").append(String.valueOf(this.lifecycleDetails));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateInternalOccCapacityRequestDetails)) {
            return false;
        }

        UpdateInternalOccCapacityRequestDetails other = (UpdateInternalOccCapacityRequestDetails) o;
        return java.util.Objects.equals(this.requestState, other.requestState)
                && java.util.Objects.equals(this.lifecycleDetails, other.lifecycleDetails)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.requestState == null ? 43 : this.requestState.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleDetails == null ? 43 : this.lifecycleDetails.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
