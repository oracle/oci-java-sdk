/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Request for updating Decryption Rule used in the firewall policy rules.
 * A Decryption Rule is used to define which traffic should be decrypted by the firewall, and how it should do so.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = UpdateDecryptionRuleDetails.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class UpdateDecryptionRuleDetails
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "condition",
        "action",
        "decryptionProfile",
        "secret",
        "position"
    })
    public UpdateDecryptionRuleDetails(
            DecryptionRuleMatchCriteria condition,
            DecryptionActionType action,
            String decryptionProfile,
            String secret,
            RulePosition position) {
        super();
        this.condition = condition;
        this.action = action;
        this.decryptionProfile = decryptionProfile;
        this.secret = secret;
        this.position = position;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {

        @com.fasterxml.jackson.annotation.JsonProperty("condition")
        private DecryptionRuleMatchCriteria condition;

        public Builder condition(DecryptionRuleMatchCriteria condition) {
            this.condition = condition;
            this.__explicitlySet__.add("condition");
            return this;
        }
        /**
         * Action:
         * <p>
         * NO_DECRYPT - Matching traffic is not decrypted.
         * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private DecryptionActionType action;

        /**
         * Action:
         * <p>
         * NO_DECRYPT - Matching traffic is not decrypted.
         * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(DecryptionActionType action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /**
         * The name of the decryption profile to use.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("decryptionProfile")
        private String decryptionProfile;

        /**
         * The name of the decryption profile to use.
         * @param decryptionProfile the value to set
         * @return this builder
         **/
        public Builder decryptionProfile(String decryptionProfile) {
            this.decryptionProfile = decryptionProfile;
            this.__explicitlySet__.add("decryptionProfile");
            return this;
        }
        /**
         * The name of a mapped secret. Its {@code type} must match that of the specified decryption profile.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secret")
        private String secret;

        /**
         * The name of a mapped secret. Its {@code type} must match that of the specified decryption profile.
         * @param secret the value to set
         * @return this builder
         **/
        public Builder secret(String secret) {
            this.secret = secret;
            this.__explicitlySet__.add("secret");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("position")
        private RulePosition position;

        public Builder position(RulePosition position) {
            this.position = position;
            this.__explicitlySet__.add("position");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public UpdateDecryptionRuleDetails build() {
            UpdateDecryptionRuleDetails model =
                    new UpdateDecryptionRuleDetails(
                            this.condition,
                            this.action,
                            this.decryptionProfile,
                            this.secret,
                            this.position);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(UpdateDecryptionRuleDetails model) {
            if (model.wasPropertyExplicitlySet("condition")) {
                this.condition(model.getCondition());
            }
            if (model.wasPropertyExplicitlySet("action")) {
                this.action(model.getAction());
            }
            if (model.wasPropertyExplicitlySet("decryptionProfile")) {
                this.decryptionProfile(model.getDecryptionProfile());
            }
            if (model.wasPropertyExplicitlySet("secret")) {
                this.secret(model.getSecret());
            }
            if (model.wasPropertyExplicitlySet("position")) {
                this.position(model.getPosition());
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

    @com.fasterxml.jackson.annotation.JsonProperty("condition")
    private final DecryptionRuleMatchCriteria condition;

    public DecryptionRuleMatchCriteria getCondition() {
        return condition;
    }

    /**
     * Action:
     * <p>
     * NO_DECRYPT - Matching traffic is not decrypted.
     * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final DecryptionActionType action;

    /**
     * Action:
     * <p>
     * NO_DECRYPT - Matching traffic is not decrypted.
     * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
     *
     * @return the value
     **/
    public DecryptionActionType getAction() {
        return action;
    }

    /**
     * The name of the decryption profile to use.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("decryptionProfile")
    private final String decryptionProfile;

    /**
     * The name of the decryption profile to use.
     * @return the value
     **/
    public String getDecryptionProfile() {
        return decryptionProfile;
    }

    /**
     * The name of a mapped secret. Its {@code type} must match that of the specified decryption profile.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    private final String secret;

    /**
     * The name of a mapped secret. Its {@code type} must match that of the specified decryption profile.
     * @return the value
     **/
    public String getSecret() {
        return secret;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("position")
    private final RulePosition position;

    public RulePosition getPosition() {
        return position;
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
        sb.append("UpdateDecryptionRuleDetails(");
        sb.append("super=").append(super.toString());
        sb.append("condition=").append(String.valueOf(this.condition));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", decryptionProfile=").append(String.valueOf(this.decryptionProfile));
        sb.append(", secret=").append(String.valueOf(this.secret));
        sb.append(", position=").append(String.valueOf(this.position));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof UpdateDecryptionRuleDetails)) {
            return false;
        }

        UpdateDecryptionRuleDetails other = (UpdateDecryptionRuleDetails) o;
        return java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.decryptionProfile, other.decryptionProfile)
                && java.util.Objects.equals(this.secret, other.secret)
                && java.util.Objects.equals(this.position, other.position)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.decryptionProfile == null ? 43 : this.decryptionProfile.hashCode());
        result = (result * PRIME) + (this.secret == null ? 43 : this.secret.hashCode());
        result = (result * PRIME) + (this.position == null ? 43 : this.position.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
