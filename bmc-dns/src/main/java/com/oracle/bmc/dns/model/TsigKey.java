/**
 * Copyright (c) 2016, 2022, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dns.model;

/**
 * A TSIG key.
 * **Warning:** Oracle recommends that you avoid using any confidential information when you supply string values using the API.
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20180115")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = TsigKey.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class TsigKey extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "algorithm",
        "name",
        "compartmentId",
        "secret",
        "freeformTags",
        "definedTags",
        "id",
        "self",
        "timeCreated",
        "lifecycleState",
        "timeUpdated"
    })
    public TsigKey(
            String algorithm,
            String name,
            String compartmentId,
            String secret,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            String id,
            String self,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            java.util.Date timeUpdated) {
        super();
        this.algorithm = algorithm;
        this.name = name;
        this.compartmentId = compartmentId;
        this.secret = secret;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.id = id;
        this.self = self;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.timeUpdated = timeUpdated;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * TSIG key algorithms are encoded as domain names, but most consist of only one
         * non-empty label, which is not required to be explicitly absolute.
         * Applicable algorithms include: hmac-sha1, hmac-sha224, hmac-sha256,
         * hmac-sha512. For more information on these algorithms, see [RFC 4635](https://tools.ietf.org/html/rfc4635#section-2).
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
        private String algorithm;

        /**
         * TSIG key algorithms are encoded as domain names, but most consist of only one
         * non-empty label, which is not required to be explicitly absolute.
         * Applicable algorithms include: hmac-sha1, hmac-sha224, hmac-sha256,
         * hmac-sha512. For more information on these algorithms, see [RFC 4635](https://tools.ietf.org/html/rfc4635#section-2).
         *
         * @param algorithm the value to set
         * @return this builder
         **/
        public Builder algorithm(String algorithm) {
            this.algorithm = algorithm;
            this.__explicitlySet__.add("algorithm");
            return this;
        }
        /**
         * A globally unique domain name identifying the key for a given pair of hosts.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A globally unique domain name identifying the key for a given pair of hosts.
         * @param name the value to set
         * @return this builder
         **/
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /**
         * The OCID of the compartment containing the TSIG key.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the compartment containing the TSIG key.
         * @param compartmentId the value to set
         * @return this builder
         **/
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * A base64 string encoding the binary shared secret.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("secret")
        private String secret;

        /**
         * A base64 string encoding the binary shared secret.
         * @param secret the value to set
         * @return this builder
         **/
        public Builder secret(String secret) {
            this.secret = secret;
            this.__explicitlySet__.add("secret");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Department": "Finance"}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         **/
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace.
         * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         * <p>
         *
         * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         **/
        public Builder definedTags(
                java.util.Map<String, java.util.Map<String, Object>> definedTags) {
            this.definedTags = definedTags;
            this.__explicitlySet__.add("definedTags");
            return this;
        }
        /**
         * The OCID of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the resource.
         * @param id the value to set
         * @return this builder
         **/
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /**
         * The canonical absolute URL of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("self")
        private String self;

        /**
         * The canonical absolute URL of the resource.
         * @param self the value to set
         * @return this builder
         **/
        public Builder self(String self) {
            this.self = self;
            this.__explicitlySet__.add("self");
            return this;
        }
        /**
         * The date and time the resource was created, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * The date and time the resource was created, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         **/
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The current state of the resource.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The current state of the resource.
         * @param lifecycleState the value to set
         * @return this builder
         **/
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * The date and time the resource was last updated, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
        private java.util.Date timeUpdated;

        /**
         * The date and time the resource was last updated, expressed in RFC 3339 timestamp format.
         * <p>
         **Example:** {@code 2016-07-22T17:23:59:60Z}
         *
         * @param timeUpdated the value to set
         * @return this builder
         **/
        public Builder timeUpdated(java.util.Date timeUpdated) {
            this.timeUpdated = timeUpdated;
            this.__explicitlySet__.add("timeUpdated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public TsigKey build() {
            TsigKey model =
                    new TsigKey(
                            this.algorithm,
                            this.name,
                            this.compartmentId,
                            this.secret,
                            this.freeformTags,
                            this.definedTags,
                            this.id,
                            this.self,
                            this.timeCreated,
                            this.lifecycleState,
                            this.timeUpdated);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(TsigKey model) {
            if (model.wasPropertyExplicitlySet("algorithm")) {
                this.algorithm(model.getAlgorithm());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("secret")) {
                this.secret(model.getSecret());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("self")) {
                this.self(model.getSelf());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("timeUpdated")) {
                this.timeUpdated(model.getTimeUpdated());
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
     * TSIG key algorithms are encoded as domain names, but most consist of only one
     * non-empty label, which is not required to be explicitly absolute.
     * Applicable algorithms include: hmac-sha1, hmac-sha224, hmac-sha256,
     * hmac-sha512. For more information on these algorithms, see [RFC 4635](https://tools.ietf.org/html/rfc4635#section-2).
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("algorithm")
    private final String algorithm;

    /**
     * TSIG key algorithms are encoded as domain names, but most consist of only one
     * non-empty label, which is not required to be explicitly absolute.
     * Applicable algorithms include: hmac-sha1, hmac-sha224, hmac-sha256,
     * hmac-sha512. For more information on these algorithms, see [RFC 4635](https://tools.ietf.org/html/rfc4635#section-2).
     *
     * @return the value
     **/
    public String getAlgorithm() {
        return algorithm;
    }

    /**
     * A globally unique domain name identifying the key for a given pair of hosts.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A globally unique domain name identifying the key for a given pair of hosts.
     * @return the value
     **/
    public String getName() {
        return name;
    }

    /**
     * The OCID of the compartment containing the TSIG key.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the compartment containing the TSIG key.
     * @return the value
     **/
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * A base64 string encoding the binary shared secret.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("secret")
    private final String secret;

    /**
     * A base64 string encoding the binary shared secret.
     * @return the value
     **/
    public String getSecret() {
        return secret;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Department": "Finance"}}
     *
     * @return the value
     **/
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * <p>
     *
     * **Example:** {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     **/
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    /**
     * The OCID of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the resource.
     * @return the value
     **/
    public String getId() {
        return id;
    }

    /**
     * The canonical absolute URL of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("self")
    private final String self;

    /**
     * The canonical absolute URL of the resource.
     * @return the value
     **/
    public String getSelf() {
        return self;
    }

    /**
     * The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * The date and time the resource was created, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The current state of the resource.
     **/
    public enum LifecycleState {
        Active("ACTIVE"),
        Creating("CREATING"),
        Deleted("DELETED"),
        Deleting("DELETING"),
        Failed("FAILED"),
        Updating("UPDATING"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

        private static final org.slf4j.Logger LOG =
                org.slf4j.LoggerFactory.getLogger(LifecycleState.class);

        private final String value;
        private static java.util.Map<String, LifecycleState> map;

        static {
            map = new java.util.HashMap<>();
            for (LifecycleState v : LifecycleState.values()) {
                if (v != UnknownEnumValue) {
                    map.put(v.getValue(), v);
                }
            }
        }

        LifecycleState(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static LifecycleState create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            LOG.warn(
                    "Received unknown value '{}' for enum 'LifecycleState', returning UnknownEnumValue",
                    key);
            return UnknownEnumValue;
        }
    };
    /**
     * The current state of the resource.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The current state of the resource.
     * @return the value
     **/
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * The date and time the resource was last updated, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeUpdated")
    private final java.util.Date timeUpdated;

    /**
     * The date and time the resource was last updated, expressed in RFC 3339 timestamp format.
     * <p>
     **Example:** {@code 2016-07-22T17:23:59:60Z}
     *
     * @return the value
     **/
    public java.util.Date getTimeUpdated() {
        return timeUpdated;
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
        sb.append("TsigKey(");
        sb.append("super=").append(super.toString());
        sb.append("algorithm=").append(String.valueOf(this.algorithm));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", secret=").append(String.valueOf(this.secret));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", self=").append(String.valueOf(this.self));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", timeUpdated=").append(String.valueOf(this.timeUpdated));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof TsigKey)) {
            return false;
        }

        TsigKey other = (TsigKey) o;
        return java.util.Objects.equals(this.algorithm, other.algorithm)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.secret, other.secret)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.self, other.self)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.timeUpdated, other.timeUpdated)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.algorithm == null ? 43 : this.algorithm.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.secret == null ? 43 : this.secret.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.self == null ? 43 : this.self.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result = (result * PRIME) + (this.timeUpdated == null ? 43 : this.timeUpdated.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
