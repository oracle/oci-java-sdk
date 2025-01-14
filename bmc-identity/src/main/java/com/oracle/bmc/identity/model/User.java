/**
 * Copyright (c) 2016, 2025, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.identity.model;

/**
 * An individual employee or system that needs to manage or use your company's Oracle Cloud
 * Infrastructure resources. Users might need to launch instances, manage remote disks, work with
 * your cloud network, etc. Users have one or more IAM Service credentials ({@link ApiKey}, {@link
 * UIPassword}, {@link SwiftPassword} and {@link AuthToken}). For more information, see [User
 * Credentials](https://docs.cloud.oracle.com/Content/Identity/usercred/usercredentials.htm)). End
 * users of your application are not typically IAM Service users, but for tenancies that have
 * identity domains, they might be. For conceptual information about users and other IAM Service
 * components, see [Overview of
 * IAM](https://docs.cloud.oracle.com/Content/Identity/getstarted/identity-domains.htm).
 *
 * <p>These users are created directly within the Oracle Cloud Infrastructure system, via the IAM
 * service. They are different from *federated users*, who authenticate themselves to the Oracle
 * Cloud Infrastructure Console via an identity provider. For more information, see [Identity
 * Providers and
 * Federation](https://docs.cloud.oracle.com/Content/Identity/Concepts/federation.htm).
 *
 * <p>To use any of the API operations, you must be authorized in an IAM policy. If you're not
 * authorized, talk to an administrator. If you're an administrator who needs to write policies to
 * give users access, see [Get Started with
 * Policies](https://docs.cloud.oracle.com/Content/Identity/policiesgs/get-started-with-policies.htm).
 *
 * <p>*Warning:** Oracle recommends that you avoid using any confidential information when you
 * supply string values using the API. <br>
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
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = User.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class User extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "id",
        "compartmentId",
        "name",
        "description",
        "email",
        "emailVerified",
        "dbUserName",
        "identityProviderId",
        "externalIdentifier",
        "timeCreated",
        "lifecycleState",
        "inactiveStatus",
        "freeformTags",
        "definedTags",
        "capabilities",
        "isMfaActivated",
        "lastSuccessfulLoginTime",
        "previousSuccessfulLoginTime"
    })
    public User(
            String id,
            String compartmentId,
            String name,
            String description,
            String email,
            Boolean emailVerified,
            String dbUserName,
            String identityProviderId,
            String externalIdentifier,
            java.util.Date timeCreated,
            LifecycleState lifecycleState,
            Long inactiveStatus,
            java.util.Map<String, String> freeformTags,
            java.util.Map<String, java.util.Map<String, Object>> definedTags,
            UserCapabilities capabilities,
            Boolean isMfaActivated,
            java.util.Date lastSuccessfulLoginTime,
            java.util.Date previousSuccessfulLoginTime) {
        super();
        this.id = id;
        this.compartmentId = compartmentId;
        this.name = name;
        this.description = description;
        this.email = email;
        this.emailVerified = emailVerified;
        this.dbUserName = dbUserName;
        this.identityProviderId = identityProviderId;
        this.externalIdentifier = externalIdentifier;
        this.timeCreated = timeCreated;
        this.lifecycleState = lifecycleState;
        this.inactiveStatus = inactiveStatus;
        this.freeformTags = freeformTags;
        this.definedTags = definedTags;
        this.capabilities = capabilities;
        this.isMfaActivated = isMfaActivated;
        this.lastSuccessfulLoginTime = lastSuccessfulLoginTime;
        this.previousSuccessfulLoginTime = previousSuccessfulLoginTime;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** The OCID of the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * The OCID of the user.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** The OCID of the tenancy containing the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
        private String compartmentId;

        /**
         * The OCID of the tenancy containing the user.
         *
         * @param compartmentId the value to set
         * @return this builder
         */
        public Builder compartmentId(String compartmentId) {
            this.compartmentId = compartmentId;
            this.__explicitlySet__.add("compartmentId");
            return this;
        }
        /**
         * The name you assign to the user during creation. This is the user's login for the
         * Console. The name must be unique across all users in the tenancy and cannot be changed.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * The name you assign to the user during creation. This is the user's login for the
         * Console. The name must be unique across all users in the tenancy and cannot be changed.
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
         * The description you assign to the user. Does not have to be unique, and it's changeable.
         *
         * <p>(For tenancies that support identity domains) You can have an empty description.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * The description you assign to the user. Does not have to be unique, and it's changeable.
         *
         * <p>(For tenancies that support identity domains) You can have an empty description.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /**
         * The email address you assign to the user. The email address must be unique across all
         * users in the tenancy.
         *
         * <p>(For tenancies that support identity domains) The email address is required unless the
         * requirement is disabled at the tenancy level.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("email")
        private String email;

        /**
         * The email address you assign to the user. The email address must be unique across all
         * users in the tenancy.
         *
         * <p>(For tenancies that support identity domains) The email address is required unless the
         * requirement is disabled at the tenancy level.
         *
         * @param email the value to set
         * @return this builder
         */
        public Builder email(String email) {
            this.email = email;
            this.__explicitlySet__.add("email");
            return this;
        }
        /** Whether the email address has been validated. */
        @com.fasterxml.jackson.annotation.JsonProperty("emailVerified")
        private Boolean emailVerified;

        /**
         * Whether the email address has been validated.
         *
         * @param emailVerified the value to set
         * @return this builder
         */
        public Builder emailVerified(Boolean emailVerified) {
            this.emailVerified = emailVerified;
            this.__explicitlySet__.add("emailVerified");
            return this;
        }
        /** DB username of the DB credential. Has to be unique across the tenancy. */
        @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
        private String dbUserName;

        /**
         * DB username of the DB credential. Has to be unique across the tenancy.
         *
         * @param dbUserName the value to set
         * @return this builder
         */
        public Builder dbUserName(String dbUserName) {
            this.dbUserName = dbUserName;
            this.__explicitlySet__.add("dbUserName");
            return this;
        }
        /** The OCID of the {@code IdentityProvider} this user belongs to. */
        @com.fasterxml.jackson.annotation.JsonProperty("identityProviderId")
        private String identityProviderId;

        /**
         * The OCID of the {@code IdentityProvider} this user belongs to.
         *
         * @param identityProviderId the value to set
         * @return this builder
         */
        public Builder identityProviderId(String identityProviderId) {
            this.identityProviderId = identityProviderId;
            this.__explicitlySet__.add("identityProviderId");
            return this;
        }
        /** Identifier of the user in the identity provider */
        @com.fasterxml.jackson.annotation.JsonProperty("externalIdentifier")
        private String externalIdentifier;

        /**
         * Identifier of the user in the identity provider
         *
         * @param externalIdentifier the value to set
         * @return this builder
         */
        public Builder externalIdentifier(String externalIdentifier) {
            this.externalIdentifier = externalIdentifier;
            this.__explicitlySet__.add("externalIdentifier");
            return this;
        }
        /**
         * Date and time the user was created, in the format defined by RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
        private java.util.Date timeCreated;

        /**
         * Date and time the user was created, in the format defined by RFC3339.
         *
         * <p>Example: {@code 2016-08-25T21:10:29.600Z}
         *
         * @param timeCreated the value to set
         * @return this builder
         */
        public Builder timeCreated(java.util.Date timeCreated) {
            this.timeCreated = timeCreated;
            this.__explicitlySet__.add("timeCreated");
            return this;
        }
        /**
         * The user's current state. After creating a user, make sure its {@code lifecycleState}
         * changes from CREATING to ACTIVE before using it.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
        private LifecycleState lifecycleState;

        /**
         * The user's current state. After creating a user, make sure its {@code lifecycleState}
         * changes from CREATING to ACTIVE before using it.
         *
         * @param lifecycleState the value to set
         * @return this builder
         */
        public Builder lifecycleState(LifecycleState lifecycleState) {
            this.lifecycleState = lifecycleState;
            this.__explicitlySet__.add("lifecycleState");
            return this;
        }
        /**
         * Returned only if the user's {@code lifecycleState} is INACTIVE. A 16-bit value showing
         * the reason why the user is inactive:
         *
         * <p>- bit 0: SUSPENDED (reserved for future use) - bit 1: DISABLED (reserved for future
         * use) - bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts
         * for the Console)
         */
        @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
        private Long inactiveStatus;

        /**
         * Returned only if the user's {@code lifecycleState} is INACTIVE. A 16-bit value showing
         * the reason why the user is inactive:
         *
         * <p>- bit 0: SUSPENDED (reserved for future use) - bit 1: DISABLED (reserved for future
         * use) - bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts
         * for the Console)
         *
         * @param inactiveStatus the value to set
         * @return this builder
         */
        public Builder inactiveStatus(Long inactiveStatus) {
            this.inactiveStatus = inactiveStatus;
            this.__explicitlySet__.add("inactiveStatus");
            return this;
        }
        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
        private java.util.Map<String, String> freeformTags;

        /**
         * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
         * name, type, or namespace. For more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
         *
         * <p>Example: {@code {"Department": "Finance"}}
         *
         * @param freeformTags the value to set
         * @return this builder
         */
        public Builder freeformTags(java.util.Map<String, String> freeformTags) {
            this.freeformTags = freeformTags;
            this.__explicitlySet__.add("freeformTags");
            return this;
        }
        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         */
        @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
        private java.util.Map<String, java.util.Map<String, Object>> definedTags;

        /**
         * Defined tags for this resource. Each key is predefined and scoped to a namespace. For
         * more information, see [Resource
         * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
         * {@code {"Operations": {"CostCenter": "42"}}}
         *
         * @param definedTags the value to set
         * @return this builder
         */
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
        /** Flag indicates if MFA has been activated for the user. */
        @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
        private Boolean isMfaActivated;

        /**
         * Flag indicates if MFA has been activated for the user.
         *
         * @param isMfaActivated the value to set
         * @return this builder
         */
        public Builder isMfaActivated(Boolean isMfaActivated) {
            this.isMfaActivated = isMfaActivated;
            this.__explicitlySet__.add("isMfaActivated");
            return this;
        }
        /**
         * The date and time of when the user most recently logged in the format defined by RFC3339
         * (ex. {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
         *
         * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020
         * at 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at
         * 1500 PST.
         *
         * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
         *
         * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulLoginTime")
        private java.util.Date lastSuccessfulLoginTime;

        /**
         * The date and time of when the user most recently logged in the format defined by RFC3339
         * (ex. {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
         *
         * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020
         * at 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at
         * 1500 PST.
         *
         * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
         *
         * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
         *
         * @param lastSuccessfulLoginTime the value to set
         * @return this builder
         */
        public Builder lastSuccessfulLoginTime(java.util.Date lastSuccessfulLoginTime) {
            this.lastSuccessfulLoginTime = lastSuccessfulLoginTime;
            this.__explicitlySet__.add("lastSuccessfulLoginTime");
            return this;
        }
        /**
         * The date and time of when the user most recently logged in the format defined by RFC3339
         * (ex. {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
         *
         * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020
         * at 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at
         * 1500 PST.
         *
         * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
         *
         * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("previousSuccessfulLoginTime")
        private java.util.Date previousSuccessfulLoginTime;

        /**
         * The date and time of when the user most recently logged in the format defined by RFC3339
         * (ex. {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
         *
         * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020
         * at 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at
         * 1500 PST.
         *
         * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
         *
         * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
         *
         * @param previousSuccessfulLoginTime the value to set
         * @return this builder
         */
        public Builder previousSuccessfulLoginTime(java.util.Date previousSuccessfulLoginTime) {
            this.previousSuccessfulLoginTime = previousSuccessfulLoginTime;
            this.__explicitlySet__.add("previousSuccessfulLoginTime");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public User build() {
            User model =
                    new User(
                            this.id,
                            this.compartmentId,
                            this.name,
                            this.description,
                            this.email,
                            this.emailVerified,
                            this.dbUserName,
                            this.identityProviderId,
                            this.externalIdentifier,
                            this.timeCreated,
                            this.lifecycleState,
                            this.inactiveStatus,
                            this.freeformTags,
                            this.definedTags,
                            this.capabilities,
                            this.isMfaActivated,
                            this.lastSuccessfulLoginTime,
                            this.previousSuccessfulLoginTime);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(User model) {
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("compartmentId")) {
                this.compartmentId(model.getCompartmentId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("email")) {
                this.email(model.getEmail());
            }
            if (model.wasPropertyExplicitlySet("emailVerified")) {
                this.emailVerified(model.getEmailVerified());
            }
            if (model.wasPropertyExplicitlySet("dbUserName")) {
                this.dbUserName(model.getDbUserName());
            }
            if (model.wasPropertyExplicitlySet("identityProviderId")) {
                this.identityProviderId(model.getIdentityProviderId());
            }
            if (model.wasPropertyExplicitlySet("externalIdentifier")) {
                this.externalIdentifier(model.getExternalIdentifier());
            }
            if (model.wasPropertyExplicitlySet("timeCreated")) {
                this.timeCreated(model.getTimeCreated());
            }
            if (model.wasPropertyExplicitlySet("lifecycleState")) {
                this.lifecycleState(model.getLifecycleState());
            }
            if (model.wasPropertyExplicitlySet("inactiveStatus")) {
                this.inactiveStatus(model.getInactiveStatus());
            }
            if (model.wasPropertyExplicitlySet("freeformTags")) {
                this.freeformTags(model.getFreeformTags());
            }
            if (model.wasPropertyExplicitlySet("definedTags")) {
                this.definedTags(model.getDefinedTags());
            }
            if (model.wasPropertyExplicitlySet("capabilities")) {
                this.capabilities(model.getCapabilities());
            }
            if (model.wasPropertyExplicitlySet("isMfaActivated")) {
                this.isMfaActivated(model.getIsMfaActivated());
            }
            if (model.wasPropertyExplicitlySet("lastSuccessfulLoginTime")) {
                this.lastSuccessfulLoginTime(model.getLastSuccessfulLoginTime());
            }
            if (model.wasPropertyExplicitlySet("previousSuccessfulLoginTime")) {
                this.previousSuccessfulLoginTime(model.getPreviousSuccessfulLoginTime());
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

    /** The OCID of the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * The OCID of the user.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** The OCID of the tenancy containing the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("compartmentId")
    private final String compartmentId;

    /**
     * The OCID of the tenancy containing the user.
     *
     * @return the value
     */
    public String getCompartmentId() {
        return compartmentId;
    }

    /**
     * The name you assign to the user during creation. This is the user's login for the Console.
     * The name must be unique across all users in the tenancy and cannot be changed.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * The name you assign to the user during creation. This is the user's login for the Console.
     * The name must be unique across all users in the tenancy and cannot be changed.
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /**
     * The description you assign to the user. Does not have to be unique, and it's changeable.
     *
     * <p>(For tenancies that support identity domains) You can have an empty description.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * The description you assign to the user. Does not have to be unique, and it's changeable.
     *
     * <p>(For tenancies that support identity domains) You can have an empty description.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /**
     * The email address you assign to the user. The email address must be unique across all users
     * in the tenancy.
     *
     * <p>(For tenancies that support identity domains) The email address is required unless the
     * requirement is disabled at the tenancy level.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("email")
    private final String email;

    /**
     * The email address you assign to the user. The email address must be unique across all users
     * in the tenancy.
     *
     * <p>(For tenancies that support identity domains) The email address is required unless the
     * requirement is disabled at the tenancy level.
     *
     * @return the value
     */
    public String getEmail() {
        return email;
    }

    /** Whether the email address has been validated. */
    @com.fasterxml.jackson.annotation.JsonProperty("emailVerified")
    private final Boolean emailVerified;

    /**
     * Whether the email address has been validated.
     *
     * @return the value
     */
    public Boolean getEmailVerified() {
        return emailVerified;
    }

    /** DB username of the DB credential. Has to be unique across the tenancy. */
    @com.fasterxml.jackson.annotation.JsonProperty("dbUserName")
    private final String dbUserName;

    /**
     * DB username of the DB credential. Has to be unique across the tenancy.
     *
     * @return the value
     */
    public String getDbUserName() {
        return dbUserName;
    }

    /** The OCID of the {@code IdentityProvider} this user belongs to. */
    @com.fasterxml.jackson.annotation.JsonProperty("identityProviderId")
    private final String identityProviderId;

    /**
     * The OCID of the {@code IdentityProvider} this user belongs to.
     *
     * @return the value
     */
    public String getIdentityProviderId() {
        return identityProviderId;
    }

    /** Identifier of the user in the identity provider */
    @com.fasterxml.jackson.annotation.JsonProperty("externalIdentifier")
    private final String externalIdentifier;

    /**
     * Identifier of the user in the identity provider
     *
     * @return the value
     */
    public String getExternalIdentifier() {
        return externalIdentifier;
    }

    /**
     * Date and time the user was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("timeCreated")
    private final java.util.Date timeCreated;

    /**
     * Date and time the user was created, in the format defined by RFC3339.
     *
     * <p>Example: {@code 2016-08-25T21:10:29.600Z}
     *
     * @return the value
     */
    public java.util.Date getTimeCreated() {
        return timeCreated;
    }

    /**
     * The user's current state. After creating a user, make sure its {@code lifecycleState} changes
     * from CREATING to ACTIVE before using it.
     */
    public enum LifecycleState implements com.oracle.bmc.http.internal.BmcEnum {
        Creating("CREATING"),
        Active("ACTIVE"),
        Inactive("INACTIVE"),
        Deleting("DELETING"),
        Deleted("DELETED"),

        /**
         * This value is used if a service returns a value for this enum that is not recognized by
         * this version of the SDK.
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
     * The user's current state. After creating a user, make sure its {@code lifecycleState} changes
     * from CREATING to ACTIVE before using it.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lifecycleState")
    private final LifecycleState lifecycleState;

    /**
     * The user's current state. After creating a user, make sure its {@code lifecycleState} changes
     * from CREATING to ACTIVE before using it.
     *
     * @return the value
     */
    public LifecycleState getLifecycleState() {
        return lifecycleState;
    }

    /**
     * Returned only if the user's {@code lifecycleState} is INACTIVE. A 16-bit value showing the
     * reason why the user is inactive:
     *
     * <p>- bit 0: SUSPENDED (reserved for future use) - bit 1: DISABLED (reserved for future use) -
     * bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts for the
     * Console)
     */
    @com.fasterxml.jackson.annotation.JsonProperty("inactiveStatus")
    private final Long inactiveStatus;

    /**
     * Returned only if the user's {@code lifecycleState} is INACTIVE. A 16-bit value showing the
     * reason why the user is inactive:
     *
     * <p>- bit 0: SUSPENDED (reserved for future use) - bit 1: DISABLED (reserved for future use) -
     * bit 2: BLOCKED (the user has exceeded the maximum number of failed login attempts for the
     * Console)
     *
     * @return the value
     */
    public Long getInactiveStatus() {
        return inactiveStatus;
    }

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("freeformTags")
    private final java.util.Map<String, String> freeformTags;

    /**
     * Free-form tags for this resource. Each tag is a simple key-value pair with no predefined
     * name, type, or namespace. For more information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm).
     *
     * <p>Example: {@code {"Department": "Finance"}}
     *
     * @return the value
     */
    public java.util.Map<String, String> getFreeformTags() {
        return freeformTags;
    }

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     */
    @com.fasterxml.jackson.annotation.JsonProperty("definedTags")
    private final java.util.Map<String, java.util.Map<String, Object>> definedTags;

    /**
     * Defined tags for this resource. Each key is predefined and scoped to a namespace. For more
     * information, see [Resource
     * Tags](https://docs.cloud.oracle.com/Content/General/Concepts/resourcetags.htm). Example:
     * {@code {"Operations": {"CostCenter": "42"}}}
     *
     * @return the value
     */
    public java.util.Map<String, java.util.Map<String, Object>> getDefinedTags() {
        return definedTags;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("capabilities")
    private final UserCapabilities capabilities;

    public UserCapabilities getCapabilities() {
        return capabilities;
    }

    /** Flag indicates if MFA has been activated for the user. */
    @com.fasterxml.jackson.annotation.JsonProperty("isMfaActivated")
    private final Boolean isMfaActivated;

    /**
     * Flag indicates if MFA has been activated for the user.
     *
     * @return the value
     */
    public Boolean getIsMfaActivated() {
        return isMfaActivated;
    }

    /**
     * The date and time of when the user most recently logged in the format defined by RFC3339 (ex.
     * {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
     *
     * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020 at
     * 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at 1500
     * PST.
     *
     * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
     *
     * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("lastSuccessfulLoginTime")
    private final java.util.Date lastSuccessfulLoginTime;

    /**
     * The date and time of when the user most recently logged in the format defined by RFC3339 (ex.
     * {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
     *
     * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020 at
     * 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at 1500
     * PST.
     *
     * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
     *
     * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
     *
     * @return the value
     */
    public java.util.Date getLastSuccessfulLoginTime() {
        return lastSuccessfulLoginTime;
    }

    /**
     * The date and time of when the user most recently logged in the format defined by RFC3339 (ex.
     * {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
     *
     * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020 at
     * 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at 1500
     * PST.
     *
     * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
     *
     * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("previousSuccessfulLoginTime")
    private final java.util.Date previousSuccessfulLoginTime;

    /**
     * The date and time of when the user most recently logged in the format defined by RFC3339 (ex.
     * {@code 2016-08-25T21:10:29.600Z}). If there is no login history, this field is null.
     *
     * <p>For illustrative purposes, suppose we have a user who has logged in at July 1st, 2020 at
     * 1200 PST and logged out 30 minutes later. They then login again on July 2nd, 2020 at 1500
     * PST.
     *
     * <p>Their previousSuccessfulLoginTime would be {@code 2020-07-01:19:00.000Z}.
     *
     * <p>Their lastSuccessfulLoginTime would be {@code 2020-07-02:22:00.000Z}.
     *
     * @return the value
     */
    public java.util.Date getPreviousSuccessfulLoginTime() {
        return previousSuccessfulLoginTime;
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
        sb.append("User(");
        sb.append("super=").append(super.toString());
        sb.append("id=").append(String.valueOf(this.id));
        sb.append(", compartmentId=").append(String.valueOf(this.compartmentId));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", email=").append(String.valueOf(this.email));
        sb.append(", emailVerified=").append(String.valueOf(this.emailVerified));
        sb.append(", dbUserName=").append(String.valueOf(this.dbUserName));
        sb.append(", identityProviderId=").append(String.valueOf(this.identityProviderId));
        sb.append(", externalIdentifier=").append(String.valueOf(this.externalIdentifier));
        sb.append(", timeCreated=").append(String.valueOf(this.timeCreated));
        sb.append(", lifecycleState=").append(String.valueOf(this.lifecycleState));
        sb.append(", inactiveStatus=").append(String.valueOf(this.inactiveStatus));
        sb.append(", freeformTags=").append(String.valueOf(this.freeformTags));
        sb.append(", definedTags=").append(String.valueOf(this.definedTags));
        sb.append(", capabilities=").append(String.valueOf(this.capabilities));
        sb.append(", isMfaActivated=").append(String.valueOf(this.isMfaActivated));
        sb.append(", lastSuccessfulLoginTime=")
                .append(String.valueOf(this.lastSuccessfulLoginTime));
        sb.append(", previousSuccessfulLoginTime=")
                .append(String.valueOf(this.previousSuccessfulLoginTime));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof User)) {
            return false;
        }

        User other = (User) o;
        return java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.compartmentId, other.compartmentId)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.email, other.email)
                && java.util.Objects.equals(this.emailVerified, other.emailVerified)
                && java.util.Objects.equals(this.dbUserName, other.dbUserName)
                && java.util.Objects.equals(this.identityProviderId, other.identityProviderId)
                && java.util.Objects.equals(this.externalIdentifier, other.externalIdentifier)
                && java.util.Objects.equals(this.timeCreated, other.timeCreated)
                && java.util.Objects.equals(this.lifecycleState, other.lifecycleState)
                && java.util.Objects.equals(this.inactiveStatus, other.inactiveStatus)
                && java.util.Objects.equals(this.freeformTags, other.freeformTags)
                && java.util.Objects.equals(this.definedTags, other.definedTags)
                && java.util.Objects.equals(this.capabilities, other.capabilities)
                && java.util.Objects.equals(this.isMfaActivated, other.isMfaActivated)
                && java.util.Objects.equals(
                        this.lastSuccessfulLoginTime, other.lastSuccessfulLoginTime)
                && java.util.Objects.equals(
                        this.previousSuccessfulLoginTime, other.previousSuccessfulLoginTime)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result =
                (result * PRIME)
                        + (this.compartmentId == null ? 43 : this.compartmentId.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result = (result * PRIME) + (this.email == null ? 43 : this.email.hashCode());
        result =
                (result * PRIME)
                        + (this.emailVerified == null ? 43 : this.emailVerified.hashCode());
        result = (result * PRIME) + (this.dbUserName == null ? 43 : this.dbUserName.hashCode());
        result =
                (result * PRIME)
                        + (this.identityProviderId == null
                                ? 43
                                : this.identityProviderId.hashCode());
        result =
                (result * PRIME)
                        + (this.externalIdentifier == null
                                ? 43
                                : this.externalIdentifier.hashCode());
        result = (result * PRIME) + (this.timeCreated == null ? 43 : this.timeCreated.hashCode());
        result =
                (result * PRIME)
                        + (this.lifecycleState == null ? 43 : this.lifecycleState.hashCode());
        result =
                (result * PRIME)
                        + (this.inactiveStatus == null ? 43 : this.inactiveStatus.hashCode());
        result = (result * PRIME) + (this.freeformTags == null ? 43 : this.freeformTags.hashCode());
        result = (result * PRIME) + (this.definedTags == null ? 43 : this.definedTags.hashCode());
        result = (result * PRIME) + (this.capabilities == null ? 43 : this.capabilities.hashCode());
        result =
                (result * PRIME)
                        + (this.isMfaActivated == null ? 43 : this.isMfaActivated.hashCode());
        result =
                (result * PRIME)
                        + (this.lastSuccessfulLoginTime == null
                                ? 43
                                : this.lastSuccessfulLoginTime.hashCode());
        result =
                (result * PRIME)
                        + (this.previousSuccessfulLoginTime == null
                                ? 43
                                : this.previousSuccessfulLoginTime.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
