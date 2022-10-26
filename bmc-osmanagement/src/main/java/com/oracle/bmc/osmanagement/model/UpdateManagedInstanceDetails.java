/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.osmanagement.model;

/**
 * Information to update a managed instance <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190801")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateManagedInstanceDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class UpdateManagedInstanceDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"notificationTopicId", "isDataCollectionAuthorized"})
    public UpdateManagedInstanceDetails(
            String notificationTopicId, Boolean isDataCollectionAuthorized) {
        super();
        this.notificationTopicId = notificationTopicId;
        this.isDataCollectionAuthorized = isDataCollectionAuthorized;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** OCID of the ONS topic used to send notification to users */
        @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
        private String notificationTopicId;

        /**
         * OCID of the ONS topic used to send notification to users
         *
         * @param notificationTopicId the value to set
         * @return this builder
         */
        public Builder notificationTopicId(String notificationTopicId) {
            this.notificationTopicId = notificationTopicId;
            this.__explicitlySet__.add("notificationTopicId");
            return this;
        }
        /** True if user allow data collection for this instance */
        @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
        private Boolean isDataCollectionAuthorized;

        /**
         * True if user allow data collection for this instance
         *
         * @param isDataCollectionAuthorized the value to set
         * @return this builder
         */
        public Builder isDataCollectionAuthorized(Boolean isDataCollectionAuthorized) {
            this.isDataCollectionAuthorized = isDataCollectionAuthorized;
            this.__explicitlySet__.add("isDataCollectionAuthorized");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateManagedInstanceDetails build() {
            UpdateManagedInstanceDetails model =
                    new UpdateManagedInstanceDetails(
                            this.notificationTopicId, this.isDataCollectionAuthorized);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateManagedInstanceDetails model) {
            if (model.wasPropertyExplicitlySet("notificationTopicId")) {
                this.notificationTopicId(model.getNotificationTopicId());
            }
            if (model.wasPropertyExplicitlySet("isDataCollectionAuthorized")) {
                this.isDataCollectionAuthorized(model.getIsDataCollectionAuthorized());
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

    /** OCID of the ONS topic used to send notification to users */
    @com.fasterxml.jackson.annotation.JsonProperty("notificationTopicId")
    private final String notificationTopicId;

    /**
     * OCID of the ONS topic used to send notification to users
     *
     * @return the value
     */
    public String getNotificationTopicId() {
        return notificationTopicId;
    }

    /** True if user allow data collection for this instance */
    @com.fasterxml.jackson.annotation.JsonProperty("isDataCollectionAuthorized")
    private final Boolean isDataCollectionAuthorized;

    /**
     * True if user allow data collection for this instance
     *
     * @return the value
     */
    public Boolean getIsDataCollectionAuthorized() {
        return isDataCollectionAuthorized;
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
        sb.append("UpdateManagedInstanceDetails(");
        sb.append("super=").append(super.toString());
        sb.append("notificationTopicId=").append(String.valueOf(this.notificationTopicId));
        sb.append(", isDataCollectionAuthorized=")
                .append(String.valueOf(this.isDataCollectionAuthorized));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateManagedInstanceDetails)) {
            return false;
        }

        UpdateManagedInstanceDetails other = (UpdateManagedInstanceDetails) o;
        return java.util.Objects.equals(this.notificationTopicId, other.notificationTopicId)
                && java.util.Objects.equals(
                        this.isDataCollectionAuthorized, other.isDataCollectionAuthorized)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.notificationTopicId == null
                                ? 43
                                : this.notificationTopicId.hashCode());
        result =
                (result * PRIME)
                        + (this.isDataCollectionAuthorized == null
                                ? 43
                                : this.isDataCollectionAuthorized.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
