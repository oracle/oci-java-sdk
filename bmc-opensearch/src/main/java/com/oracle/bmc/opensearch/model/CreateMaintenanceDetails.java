/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.opensearch.model;

/**
 * Details for creation of maintenance details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180828")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = CreateMaintenanceDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class CreateMaintenanceDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"notificationEmailIds"})
    public CreateMaintenanceDetails(java.util.List<String> notificationEmailIds) {
        super();
        this.notificationEmailIds = notificationEmailIds;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The Email IDs given by the customer to get notified about maintenance activities
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("notificationEmailIds")
        private java.util.List<String> notificationEmailIds;

        /**
         * The Email IDs given by the customer to get notified about maintenance activities
         * @param notificationEmailIds the value to set
         * @return this builder
         **/
        public Builder notificationEmailIds(java.util.List<String> notificationEmailIds) {
            this.notificationEmailIds = notificationEmailIds;
            this.__explicitlySet__.add("notificationEmailIds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateMaintenanceDetails build() {
            CreateMaintenanceDetails model =
                    new CreateMaintenanceDetails(this.notificationEmailIds);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateMaintenanceDetails model) {
            if (model.wasPropertyExplicitlySet("notificationEmailIds")) {
                this.notificationEmailIds(model.getNotificationEmailIds());
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
     * The Email IDs given by the customer to get notified about maintenance activities
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("notificationEmailIds")
    private final java.util.List<String> notificationEmailIds;

    /**
     * The Email IDs given by the customer to get notified about maintenance activities
     * @return the value
     **/
    public java.util.List<String> getNotificationEmailIds() {
        return notificationEmailIds;
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
        sb.append("CreateMaintenanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("notificationEmailIds=").append(String.valueOf(this.notificationEmailIds));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateMaintenanceDetails)) {
            return false;
        }

        CreateMaintenanceDetails other = (CreateMaintenanceDetails) o;
        return java.util.Objects.equals(this.notificationEmailIds, other.notificationEmailIds)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.notificationEmailIds == null
                                ? 43
                                : this.notificationEmailIds.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
