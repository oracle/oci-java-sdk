/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Summary for Decryption Rule used in the firewall policy rules. A Decryption Rule is used to
 * define which traffic should be decrypted by the firewall, and how it should do so. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230501")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = DecryptionRuleSummary.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class DecryptionRuleSummary
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "action",
        "decryptionProfile",
        "secret",
        "priorityOrder",
        "parentResourceId"
    })
    public DecryptionRuleSummary(
            String name,
            DecryptionActionType action,
            String decryptionProfile,
            String secret,
            Long priorityOrder,
            String parentResourceId) {
        super();
        this.name = name;
        this.action = action;
        this.decryptionProfile = decryptionProfile;
        this.secret = secret;
        this.priorityOrder = priorityOrder;
        this.parentResourceId = parentResourceId;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Name for the decryption rule, must be unique within the policy. */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name for the decryption rule, must be unique within the policy.
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * Action:
         *
         * <p>NO_DECRYPT - Matching traffic is not decrypted. * DECRYPT - Matching traffic is
         * decrypted with the specified {@code secret} according to the specified {@code
         * decryptionProfile}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("action")
        private DecryptionActionType action;

        /**
         * Action:
         *
         * <p>NO_DECRYPT - Matching traffic is not decrypted. * DECRYPT - Matching traffic is
         * decrypted with the specified {@code secret} according to the specified {@code
         * decryptionProfile}.
         *
         * @param action the value to set
         * @return this builder
         */
        public Builder action(DecryptionActionType action) {
            this.action = action;
            this.__explicitlySet__.add("action");
            return this;
        }
        /** The name of the decryption profile to use. */
        @com.fasterxml.jackson.annotation.JsonProperty("decryptionProfile")
        private String decryptionProfile;

        /**
         * The name of the decryption profile to use.
         *
         * @param decryptionProfile the value to set
         * @return this builder
         */
        public Builder decryptionProfile(String decryptionProfile) {
            this.decryptionProfile = decryptionProfile;
            this.__explicitlySet__.add("decryptionProfile");
            return this;
        }
        /**
         * The name of a mapped secret. Its {@code type} must match that of the specified decryption
         * profile.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("secret")
        private String secret;

        /**
         * The name of a mapped secret. Its {@code type} must match that of the specified decryption
         * profile.
         *
         * @param secret the value to set
         * @return this builder
         */
        public Builder secret(String secret) {
            this.secret = secret;
            this.__explicitlySet__.add("secret");
            return this;
        }
        /** The priority order in which this rule should be evaluated. */
        @com.fasterxml.jackson.annotation.JsonProperty("priorityOrder")
        private Long priorityOrder;

        /**
         * The priority order in which this rule should be evaluated.
         *
         * @param priorityOrder the value to set
         * @return this builder
         */
        public Builder priorityOrder(Long priorityOrder) {
            this.priorityOrder = priorityOrder;
            this.__explicitlySet__.add("priorityOrder");
            return this;
        }
        /** OCID of the Network Firewall Policy this application belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
        private String parentResourceId;

        /**
         * OCID of the Network Firewall Policy this application belongs to.
         *
         * @param parentResourceId the value to set
         * @return this builder
         */
        public Builder parentResourceId(String parentResourceId) {
            this.parentResourceId = parentResourceId;
            this.__explicitlySet__.add("parentResourceId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DecryptionRuleSummary build() {
            DecryptionRuleSummary model =
                    new DecryptionRuleSummary(
                            this.name,
                            this.action,
                            this.decryptionProfile,
                            this.secret,
                            this.priorityOrder,
                            this.parentResourceId);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DecryptionRuleSummary model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
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
            if (model.wasPropertyExplicitlySet("priorityOrder")) {
                this.priorityOrder(model.getPriorityOrder());
            }
            if (model.wasPropertyExplicitlySet("parentResourceId")) {
                this.parentResourceId(model.getParentResourceId());
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

    /** Name for the decryption rule, must be unique within the policy. */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name for the decryption rule, must be unique within the policy.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * Action:
     *
     * <p>NO_DECRYPT - Matching traffic is not decrypted. * DECRYPT - Matching traffic is decrypted
     * with the specified {@code secret} according to the specified {@code decryptionProfile}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final DecryptionActionType action;

    /**
     * Action:
     *
     * <p>NO_DECRYPT - Matching traffic is not decrypted. * DECRYPT - Matching traffic is decrypted
     * with the specified {@code secret} according to the specified {@code decryptionProfile}.
     *
     * @return the value
     */
    public DecryptionActionType getAction() {
        return action;
    }

    /** The name of the decryption profile to use. */
    @com.fasterxml.jackson.annotation.JsonProperty("decryptionProfile")
    private final String decryptionProfile;

    /**
     * The name of the decryption profile to use.
     *
     * @return the value
     */
    public String getDecryptionProfile() {
        return decryptionProfile;
    }

    /**
     * The name of a mapped secret. Its {@code type} must match that of the specified decryption
     * profile.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    private final String secret;

    /**
     * The name of a mapped secret. Its {@code type} must match that of the specified decryption
     * profile.
     *
     * @return the value
     */
    public String getSecret() {
        return secret;
    }

    /** The priority order in which this rule should be evaluated. */
    @com.fasterxml.jackson.annotation.JsonProperty("priorityOrder")
    private final Long priorityOrder;

    /**
     * The priority order in which this rule should be evaluated.
     *
     * @return the value
     */
    public Long getPriorityOrder() {
        return priorityOrder;
    }

    /** OCID of the Network Firewall Policy this application belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("parentResourceId")
    private final String parentResourceId;

    /**
     * OCID of the Network Firewall Policy this application belongs to.
     *
     * @return the value
     */
    public String getParentResourceId() {
        return parentResourceId;
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
        sb.append("DecryptionRuleSummary(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", decryptionProfile=").append(String.valueOf(this.decryptionProfile));
        sb.append(", secret=").append(String.valueOf(this.secret));
        sb.append(", priorityOrder=").append(String.valueOf(this.priorityOrder));
        sb.append(", parentResourceId=").append(String.valueOf(this.parentResourceId));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DecryptionRuleSummary)) {
            return false;
        }

        DecryptionRuleSummary other = (DecryptionRuleSummary) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.decryptionProfile, other.decryptionProfile)
                && java.util.Objects.equals(this.secret, other.secret)
                && java.util.Objects.equals(this.priorityOrder, other.priorityOrder)
                && java.util.Objects.equals(this.parentResourceId, other.parentResourceId)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.decryptionProfile == null ? 43 : this.decryptionProfile.hashCode());
        result = (result * PRIME) + (this.secret == null ? 43 : this.secret.hashCode());
        result =
                (result * PRIME)
                        + (this.priorityOrder == null ? 43 : this.priorityOrder.hashCode());
        result =
                (result * PRIME)
                        + (this.parentResourceId == null ? 43 : this.parentResourceId.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
