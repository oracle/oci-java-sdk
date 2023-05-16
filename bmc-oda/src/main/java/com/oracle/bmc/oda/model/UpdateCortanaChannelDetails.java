/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.oda.model;

/**
 * Properties to update a Cortana channel. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20190506")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = UpdateCortanaChannelDetails.Builder.class)
@com.fasterxml.jackson.annotation.JsonTypeInfo(
        use = com.fasterxml.jackson.annotation.JsonTypeInfo.Id.NAME,
        include = com.fasterxml.jackson.annotation.JsonTypeInfo.As.PROPERTY,
        property = "type")
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class UpdateCortanaChannelDetails extends UpdateChannelDetails {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("sessionExpiryDurationInMilliseconds")
        private Long sessionExpiryDurationInMilliseconds;

        public Builder sessionExpiryDurationInMilliseconds(
                Long sessionExpiryDurationInMilliseconds) {
            this.sessionExpiryDurationInMilliseconds = sessionExpiryDurationInMilliseconds;
            this.__explicitlySet__.add("sessionExpiryDurationInMilliseconds");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The Microsoft App ID that you obtained when you created your bot registration in Azure.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("msaAppId")
        private String msaAppId;

        /**
         * The Microsoft App ID that you obtained when you created your bot registration in Azure.
         *
         * @param msaAppId the value to set
         * @return this builder
         */
        public Builder msaAppId(String msaAppId) {
            this.msaAppId = msaAppId;
            this.__explicitlySet__.add("msaAppId");
            return this;
        }
        /** The client secret that you obtained from your bot registration. */
        @com.fasterxml.jackson.annotation.JsonProperty("msaAppPassword")
        private String msaAppPassword;

        /**
         * The client secret that you obtained from your bot registration.
         *
         * @param msaAppPassword the value to set
         * @return this builder
         */
        public Builder msaAppPassword(String msaAppPassword) {
            this.msaAppPassword = msaAppPassword;
            this.__explicitlySet__.add("msaAppPassword");
            return this;
        }
        /** The ID of the Skill or Digital Assistant that the Channel is routed to. */
        @com.fasterxml.jackson.annotation.JsonProperty("botId")
        private String botId;

        /**
         * The ID of the Skill or Digital Assistant that the Channel is routed to.
         *
         * @param botId the value to set
         * @return this builder
         */
        public Builder botId(String botId) {
            this.botId = botId;
            this.__explicitlySet__.add("botId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateCortanaChannelDetails build() {
            UpdateCortanaChannelDetails model =
                    new UpdateCortanaChannelDetails(
                            this.name,
                            this.description,
                            this.sessionExpiryDurationInMilliseconds,
                            this.freeformTags,
                            this.definedTags,
                            this.msaAppId,
                            this.msaAppPassword,
                            this.botId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateCortanaChannelDetails model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("sessionExpiryDurationInMilliseconds")) {
                this.sessionExpiryDurationInMilliseconds(
                        model.getSessionExpiryDurationInMilliseconds());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("msaAppId")) {
                this.msaAppId(model.getMsaAppId());
            }
            if (model.wasPropertyExplicitlySet("msaAppPassword")) {
                this.msaAppPassword(model.getMsaAppPassword());
            }
            if (model.wasPropertyExplicitlySet("botId")) {
                this.botId(model.getBotId());
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

    @Deprecated
    public UpdateCortanaChannelDetails(
            String name,
            String description,
            Long sessionExpiryDurationInMilliseconds,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String msaAppId,
            String msaAppPassword,
            String botId) {
        super(name, description, sessionExpiryDurationInMilliseconds, freeformTags, definedTags);
        this.msaAppId = msaAppId;
        this.msaAppPassword = msaAppPassword;
        this.botId = botId;
    }

    /** The Microsoft App ID that you obtained when you created your bot registration in Azure. */
    @com.fasterxml.jackson.annotation.JsonProperty("msaAppId")
    private final String msaAppId;

    /**
     * The Microsoft App ID that you obtained when you created your bot registration in Azure.
     *
     * @return the value
     */
    public String getMsaAppId() {
        return msaAppId;
    }

    /** The client secret that you obtained from your bot registration. */
    @com.fasterxml.jackson.annotation.JsonProperty("msaAppPassword")
    private final String msaAppPassword;

    /**
     * The client secret that you obtained from your bot registration.
     *
     * @return the value
     */
    public String getMsaAppPassword() {
        return msaAppPassword;
    }

    /** The ID of the Skill or Digital Assistant that the Channel is routed to. */
    @com.fasterxml.jackson.annotation.JsonProperty("botId")
    private final String botId;

    /**
     * The ID of the Skill or Digital Assistant that the Channel is routed to.
     *
     * @return the value
     */
    public String getBotId() {
        return botId;
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
        sb.append("UpdateCortanaChannelDetails(");
        sb.append("super=").append(super.toString(includeByteArrayContents));
        sb.append(", msaAppId=").append(String.valueOf(this.msaAppId));
        sb.append(", msaAppPassword=").append("<redacted>");
        sb.append(", botId=").append(String.valueOf(this.botId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateCortanaChannelDetails)) {
            return false;
        }

        UpdateCortanaChannelDetails other = (UpdateCortanaChannelDetails) o;
        return java.util.Objects.equals(this.msaAppId, other.msaAppId)
                && java.util.Objects.equals(this.msaAppPassword, other.msaAppPassword)
                && java.util.Objects.equals(this.botId, other.botId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = super.hashCode();
        result = (result * PRIME) + (this.msaAppId == null ? 43 : this.msaAppId.hashCode());
        result =
                (result * PRIME)
                        + (this.msaAppPassword == null ? 43 : this.msaAppPassword.hashCode());
        result = (result * PRIME) + (this.botId == null ? 43 : this.botId.hashCode());
        return result;
    }
}
