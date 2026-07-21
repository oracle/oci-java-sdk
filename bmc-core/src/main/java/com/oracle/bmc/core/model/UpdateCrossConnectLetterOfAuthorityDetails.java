/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.core.model;

/**
 * Update the details of the Letter of Authority associated with a cross-connect. Upon successful
 * alterations a new updated copy of the LOA will be attached to the cross-connect. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCrossConnectLetterOfAuthorityDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCrossConnectLetterOfAuthorityDetails
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "shouldExtend",
        "shouldRemoveAuthorizedAgent",
        "authorizedAgent"
    })
    public UpdateCrossConnectLetterOfAuthorityDetails(
            Boolean shouldExtend, Boolean shouldRemoveAuthorizedAgent, String authorizedAgent) {
        super();
        this.shouldExtend = shouldExtend;
        this.shouldRemoveAuthorizedAgent = shouldRemoveAuthorizedAgent;
        this.authorizedAgent = authorizedAgent;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * A boolean flag to indicate whether to extend the expiry of the associated LOA with the
         * provided cross-connect. If un-set or set to false, it does not alter the existing expiry
         * of the LOA. On extension an updated copy of the LOA will be provided with the new expiry
         * date. An LOA cannot be extended more than 3 times.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldExtend")
        private Boolean shouldExtend;

        /**
         * A boolean flag to indicate whether to extend the expiry of the associated LOA with the
         * provided cross-connect. If un-set or set to false, it does not alter the existing expiry
         * of the LOA. On extension an updated copy of the LOA will be provided with the new expiry
         * date. An LOA cannot be extended more than 3 times.
         *
         * @param shouldExtend the value to set
         * @return this builder
         */
        public Builder shouldExtend(Boolean shouldExtend) {
            this.shouldExtend = shouldExtend;
            this.__explicitlySet__.add("shouldExtend");
            return this;
        }
        /**
         * A boolean flag to indicate whether to remove an attached Authorized Agent to the LOA. If
         * this boolean flag is set, an attempt will be made to remove the attached authorized agent
         * to the LOA, if any, and any value given in the field 'authorizedAgent' will be ignored.
         * In case, of updating an existing Authorized Agent, keep this flag unset and set the
         * expected value in 'authorizedAgent'.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("shouldRemoveAuthorizedAgent")
        private Boolean shouldRemoveAuthorizedAgent;

        /**
         * A boolean flag to indicate whether to remove an attached Authorized Agent to the LOA. If
         * this boolean flag is set, an attempt will be made to remove the attached authorized agent
         * to the LOA, if any, and any value given in the field 'authorizedAgent' will be ignored.
         * In case, of updating an existing Authorized Agent, keep this flag unset and set the
         * expected value in 'authorizedAgent'.
         *
         * @param shouldRemoveAuthorizedAgent the value to set
         * @return this builder
         */
        public Builder shouldRemoveAuthorizedAgent(Boolean shouldRemoveAuthorizedAgent) {
            this.shouldRemoveAuthorizedAgent = shouldRemoveAuthorizedAgent;
            this.__explicitlySet__.add("shouldRemoveAuthorizedAgent");
            return this;
        }
        /**
         * Name of a customer authorized agent which will be appended to the LOA as the field
         * 'Authorized Agent'. If the field is left un-set in the request body, no changes will be
         * done on the LOA for Authorized Agent.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("authorizedAgent")
        private String authorizedAgent;

        /**
         * Name of a customer authorized agent which will be appended to the LOA as the field
         * 'Authorized Agent'. If the field is left un-set in the request body, no changes will be
         * done on the LOA for Authorized Agent.
         *
         * @param authorizedAgent the value to set
         * @return this builder
         */
        public Builder authorizedAgent(String authorizedAgent) {
            this.authorizedAgent = authorizedAgent;
            this.__explicitlySet__.add("authorizedAgent");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCrossConnectLetterOfAuthorityDetails build() {
            UpdateCrossConnectLetterOfAuthorityDetails model =
                    new UpdateCrossConnectLetterOfAuthorityDetails(
                            this.shouldExtend,
                            this.shouldRemoveAuthorizedAgent,
                            this.authorizedAgent);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCrossConnectLetterOfAuthorityDetails model) {
            if (model.wasPropertyExplicitlySet("shouldExtend")) {
                this.shouldExtend(model.getShouldExtend());
            }
            if (model.wasPropertyExplicitlySet("shouldRemoveAuthorizedAgent")) {
                this.shouldRemoveAuthorizedAgent(model.getShouldRemoveAuthorizedAgent());
            }
            if (model.wasPropertyExplicitlySet("authorizedAgent")) {
                this.authorizedAgent(model.getAuthorizedAgent());
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
     * A boolean flag to indicate whether to extend the expiry of the associated LOA with the
     * provided cross-connect. If un-set or set to false, it does not alter the existing expiry of
     * the LOA. On extension an updated copy of the LOA will be provided with the new expiry date.
     * An LOA cannot be extended more than 3 times.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldExtend")
    private final Boolean shouldExtend;

    /**
     * A boolean flag to indicate whether to extend the expiry of the associated LOA with the
     * provided cross-connect. If un-set or set to false, it does not alter the existing expiry of
     * the LOA. On extension an updated copy of the LOA will be provided with the new expiry date.
     * An LOA cannot be extended more than 3 times.
     *
     * @return the value
     */
    public Boolean getShouldExtend() {
        return shouldExtend;
    }

    /**
     * A boolean flag to indicate whether to remove an attached Authorized Agent to the LOA. If this
     * boolean flag is set, an attempt will be made to remove the attached authorized agent to the
     * LOA, if any, and any value given in the field 'authorizedAgent' will be ignored. In case, of
     * updating an existing Authorized Agent, keep this flag unset and set the expected value in
     * 'authorizedAgent'.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("shouldRemoveAuthorizedAgent")
    private final Boolean shouldRemoveAuthorizedAgent;

    /**
     * A boolean flag to indicate whether to remove an attached Authorized Agent to the LOA. If this
     * boolean flag is set, an attempt will be made to remove the attached authorized agent to the
     * LOA, if any, and any value given in the field 'authorizedAgent' will be ignored. In case, of
     * updating an existing Authorized Agent, keep this flag unset and set the expected value in
     * 'authorizedAgent'.
     *
     * @return the value
     */
    public Boolean getShouldRemoveAuthorizedAgent() {
        return shouldRemoveAuthorizedAgent;
    }

    /**
     * Name of a customer authorized agent which will be appended to the LOA as the field
     * 'Authorized Agent'. If the field is left un-set in the request body, no changes will be done
     * on the LOA for Authorized Agent.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("authorizedAgent")
    private final String authorizedAgent;

    /**
     * Name of a customer authorized agent which will be appended to the LOA as the field
     * 'Authorized Agent'. If the field is left un-set in the request body, no changes will be done
     * on the LOA for Authorized Agent.
     *
     * @return the value
     */
    public String getAuthorizedAgent() {
        return authorizedAgent;
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
        sb.append("UpdateCrossConnectLetterOfAuthorityDetails(");
        sb.append("super=").append(super.toString());
        sb.append("shouldExtend=").append(String.valueOf(this.shouldExtend));
        sb.append(", shouldRemoveAuthorizedAgent=")
                .append(String.valueOf(this.shouldRemoveAuthorizedAgent));
        sb.append(", authorizedAgent=").append(String.valueOf(this.authorizedAgent));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCrossConnectLetterOfAuthorityDetails)) {
            return false;
        }

        UpdateCrossConnectLetterOfAuthorityDetails other =
                (UpdateCrossConnectLetterOfAuthorityDetails) o;
        return java.util.Objects.equals(this.shouldExtend, other.shouldExtend)
                && java.util.Objects.equals(
                        this.shouldRemoveAuthorizedAgent, other.shouldRemoveAuthorizedAgent)
                && java.util.Objects.equals(this.authorizedAgent, other.authorizedAgent)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.shouldExtend == null ? 43 : this.shouldExtend.hashCode());
        result =
                (result * PRIME)
                        + (this.shouldRemoveAuthorizedAgent == null
                                ? 43
                                : this.shouldRemoveAuthorizedAgent.hashCode());
        result =
                (result * PRIME)
                        + (this.authorizedAgent == null ? 43 : this.authorizedAgent.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
