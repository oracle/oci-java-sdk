/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.networkfirewall.model;

/**
 * Decryption Rule used in the firewall policy rules.
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
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20211001")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = DecryptionRule.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class DecryptionRule extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "name",
        "condition",
        "action",
        "decryptionProfile",
        "secret"
    })
    public DecryptionRule(
            String name,
            DecryptionRuleMatchCriteria condition,
            Action action,
            String decryptionProfile,
            String secret) {
        super();
        this.name = name;
        this.condition = condition;
        this.action = action;
        this.decryptionProfile = decryptionProfile;
        this.secret = secret;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name for the decryption rule, must be unique within the policy.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * Name for the decryption rule, must be unique within the policy.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }

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
        private Action action;

        /**
         * Action:
         * <p>
         * NO_DECRYPT - Matching traffic is not decrypted.
         * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
         *
         * @param action the value to set
         * @return this builder
         **/
        public Builder action(Action action) {
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

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public DecryptionRule build() {
            DecryptionRule model =
                    new DecryptionRule(
                            this.name,
                            this.condition,
                            this.action,
                            this.decryptionProfile,
                            this.secret);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(DecryptionRule model) {
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
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
     * Name for the decryption rule, must be unique within the policy.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * Name for the decryption rule, must be unique within the policy.
     * @return the value
     **/
    public String getName() {
        return name;
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
    public enum Action {
        NoDecrypt("NO_DECRYPT"),
        Decrypt("DECRYPT"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG = org.slf4j.LoggerFactory.getLogger(Action.class);

        private final String value;
        private static java.util.Map<String, Action> map;

        static {
            map = new java.util.HashMap<>();
            for (Action v : Action.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        Action(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static Action create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'Action', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * Action:
     * <p>
     * NO_DECRYPT - Matching traffic is not decrypted.
     * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("action")
    private final Action action;

    /**
     * Action:
     * <p>
     * NO_DECRYPT - Matching traffic is not decrypted.
     * * DECRYPT - Matching traffic is decrypted with the specified {@code secret} according to the specified {@code decryptionProfile}.
     *
     * @return the value
     **/
    public Action getAction() {
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
        sb.append("DecryptionRule(");
        sb.append("super=").append(super.toString());
        sb.append("name=").append(String.valueOf(this.name));
        sb.append(", condition=").append(String.valueOf(this.condition));
        sb.append(", action=").append(String.valueOf(this.action));
        sb.append(", decryptionProfile=").append(String.valueOf(this.decryptionProfile));
        sb.append(", secret=").append(String.valueOf(this.secret));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof DecryptionRule)) {
            return false;
        }

        DecryptionRule other = (DecryptionRule) o;
        return java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.condition, other.condition)
                && java.util.Objects.equals(this.action, other.action)
                && java.util.Objects.equals(this.decryptionProfile, other.decryptionProfile)
                && java.util.Objects.equals(this.secret, other.secret)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.condition == null ? 43 : this.condition.hashCode());
        result = (result * PRIME) + (this.action == null ? 43 : this.action.hashCode());
        result =
                (result * PRIME)
                        + (this.decryptionProfile == null ? 43 : this.decryptionProfile.hashCode());
        result = (result * PRIME) + (this.secret == null ? 43 : this.secret.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
