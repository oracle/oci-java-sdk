/**
 * Copyright (c) 2016, 2019, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc.identity.model;

/**
 * An individual employee or system that needs to manage or use your company's Oracle Cloud Infrastructure
 * resources. Users might need to launch instances, manage remote disks, work with your cloud network, etc. Users
 * have one or more IAM Service credentials ({@link ApiKey},
 * {@link UIPassword}, {@link SwiftPassword} and
 * {@link AuthToken}).
 * For more information, see [User Credentials](https://docs.cloud.oracle.com/Content/API/Concepts/usercredentials.htm)). End users of your
 * application are not typically IAM Service users. For conceptual information about users and other IAM Service
 * components, see [Overview of the IAM Service](https://docs.cloud.oracle.com/Content/Identity/Concepts/overview.htm).
 * <p>
 * These users are created directly within the Oracle Cloud Infrastructure system, via the IAM service.
 * They are different from *federated users*, who authenticate themselves to the Oracle Cloud Infrastructure
 * Console via an identity provider. For more information, see
 * [Identity Providers and Federation](https://docs.cloud.oracle.com/Content/Identity/Concepts/federation.htm).
 * <p>
 * To use any of the API operations, you must be authorized in an IAM policy. If you're not authorized,
 * talk to an administrator. If you're an administrator who needs to write policies to give users access,
 * see [Getting Started with Policies](https://docs.cloud.oracle.com/Content/Identity/Concepts/policygetstarted.htm).
 *
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20160918")
@lombok.AllArgsConstructor(onConstructor = @__({@Deprecated}))
@lombok.Value
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public class User {
    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    @lombok.experimental.Accessors(fluent = true)
    public static class Builder {
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }

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

        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("identityProviderId")
        private String identityProviderId;

        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            this.__explicitlySet__.add("identityProviderId");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("externalIdentifier")
        private String externalIdentifier;

        public Builder externalIdentifier(String externalIdentifier) {
            this.externalIdentifier = externalIdentifier;
            this.__explicitlySet__.add("externalIdentifier");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
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

        @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
        private UserCapabilities capabilities;

        public Builder capabilities(UserCapabilities capabilities) {
            this.capabilities = capabilities;
            this.__explicitlySet__.add("capabilities");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
        private Boolean isMfaActivated;

        public Builder isMfaActivated(Boolean isMfaActivated) {
            this.isMfaActivated = isMfaActivated;
            this.__explicitlySet__.add("isMfaActivated");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User __instance__ =
                    new User(
                            id,
                            compartmentId,
                            name,
                            description,
                            email,
                            identityProviderId,
                            externalIdentifier,
                            timeCreated,
                            lifecycleState,
                            inactiveStatus,
                            freeformTags,
                            definedTags,
                            capabilities,
                            isMfaActivated);
            __instance__.__explicitlySet__.addAll(__explicitlySet__);
            return __instance__;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User o) {
            Builder copiedBuilder =
                    id(o.getId())
                            .compartmentId(o.getCompartmentId())
                            .name(o.getName())
                            .description(o.getDescription())
                            .email(o.getEmail())
                            .identityProviderId(o.getIdentityProviderId())
                            .externalIdentifier(o.getExternalIdentifier())
                            .timeCreated(o.getTimeCreated())
                            .lifecycleState(o.getLifecycleState())
                            .inactiveStatus(o.getInactiveStatus())
                            .freeformTags(o.getFreeformTags())
                            .definedTags(o.getDefinedTags())
                            .capabilities(o.getCapabilities())
                            .isMfaActivated(o.getIsMfaActivated());

            copiedBuilder.__explicitlySet__.retainAll(o.__explicitlySet__);
            return copiedBuilder;
        }
    }

    /**
     * Create a new builder.
     */
    public static Builder builder() {
        return new Builder();
    }

    /**
     * The OCID of the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    String id;

    /**
     * The OCID of the tenancy containing the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    String compartmentId;

    /**
     * The name you assign to the user during creation. This is the user's login for the Console.
     * The name must be unique across all users in the tenancy and cannot be changed.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    String name;

    /**
     * The description you assign to the user. Does not have to be unique, and it's changeable.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    String description;

    /**
     * The email you assign to the user during creation.
     * The name must be unique across all users in the tenancy.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    String email;

    /**
     * The OCID of the `IdentityProvider` this user belongs to.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("identityProviderId")
    String identityProviderId;

    /**
     * Identifier of the user in the identity provider
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("externalIdentifier")
    String externalIdentifier;

    /**
     * Date and time the user was created, in the format defined by RFC3339.
     * <p>
     * Example: `2016-08-25T21:10:29.600Z`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    java.util.Date timeCreated;
    /**
     * The user's current state. After creating a user, make sure its `lifecycleState` changes from CREATING to
     * ACTIVE before using it.
     *
     **/
    @lombok.extern.slf4j.Slf4j
    public enum LifecycleState {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by this
         * version of the SDK.
         */
        UnknownEnumValue(null);

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
     * The user's current state. After creating a user, make sure its `lifecycleState` changes from CREATING to
     * ACTIVE before using it.
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    LifecycleState lifecycleState;

    /**
     * Returned only if the user's `lifecycleState` is INACTIVE. A 16-bit value showing the reason why the user
     * is inactive:
     * <p>
     * - bit 0: SUSPENDED (reserved for future use)
     * - bit 1: DISABLED (reserved for future use)
     * - bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts for the Console)
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    Long inactiveStatus;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined name, type, or namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Department\": \"Finance\"}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    java.util.Map<String, String> freeformTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace.
     * For more information, see [Resource Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     * Example: `{\"Operations\": {\"CostCenter\": \"42\"}}`
     *
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Properties indicating how the user is allowed to authenticate.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    UserCapabilities capabilities;

    /**
     * Flag indicates if MFA has been activated for the user.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
    Boolean isMfaActivated;

    @com.fasterxml.jackson.annotation.JsonIgnore
    private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();
}
