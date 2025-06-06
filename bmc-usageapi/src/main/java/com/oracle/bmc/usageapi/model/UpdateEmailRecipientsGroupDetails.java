/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.usageapi.model;

/**
 * The saved email recipient group to receive usage statement emails. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200107")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateEmailRecipientsGroupDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateEmailRecipientsGroupDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"recipientsList"})
    public UpdateEmailRecipientsGroupDetails(java.util.List<EmailRecipient> recipientsList) {
        super();
        this.recipientsList = recipientsList;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The list of recipients will receive usage statement emails. */
        @com.fasterxml.jackson.annotation.JsonProperty("recipientsList")
        private java.util.List<EmailRecipient> recipientsList;

        /**
         * The list of recipients will receive usage statement emails.
         *
         * @param recipientsList the value to set
         * @return this builder
         */
        public Builder recipientsList(java.util.List<EmailRecipient> recipientsList) {
            this.recipientsList = recipientsList;
            this.__explicitlySet__.add("recipientsList");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateEmailRecipientsGroupDetails build() {
            UpdateEmailRecipientsGroupDetails model =
                    new UpdateEmailRecipientsGroupDetails(this.recipientsList);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateEmailRecipientsGroupDetails model) {
            if (model.wasPropertyExplicitlySet("recipientsList")) {
                this.recipientsList(model.getRecipientsList());
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

    /** The list of recipients will receive usage statement emails. */
    @com.fasterxml.jackson.annotation.JsonProperty("recipientsList")
    private final java.util.List<EmailRecipient> recipientsList;

    /**
     * The list of recipients will receive usage statement emails.
     *
     * @return the value
     */
    public java.util.List<EmailRecipient> getRecipientsList() {
        return recipientsList;
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
        sb.append("UpdateEmailRecipientsGroupDetails(");
        sb.append("super=").append(super.toString());
        sb.append("recipientsList=").append(String.valueOf(this.recipientsList));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateEmailRecipientsGroupDetails)) {
            return false;
        }

        UpdateEmailRecipientsGroupDetails other = (UpdateEmailRecipientsGroupDetails) o;
        return java.util.Objects.equals(this.recipientsList, other.recipientsList)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result =
                (result * PRIME)
                        + (this.recipientsList == null ? 43 : this.recipientsList.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
