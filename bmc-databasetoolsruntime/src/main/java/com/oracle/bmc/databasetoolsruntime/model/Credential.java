/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * Credential information
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = Credential.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class Credential extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "key",
        "userName",
        "windowsDomain",
        "enabled",
        "keyType",
        "owner",
        "relatedResource"
    })
    public Credential(
            String key,
            String userName,
            String windowsDomain,
            String enabled,
            CredentialKeyType keyType,
            String owner,
            CredentialRelatedResource relatedResource) {
        super();
        this.key = key;
        this.userName = userName;
        this.windowsDomain = windowsDomain;
        this.enabled = enabled;
        this.keyType = keyType;
        this.owner = owner;
        this.relatedResource = relatedResource;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Name of the credential
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("key")
        private String key;

        /**
         * Name of the credential
         * @param key the value to set
         * @return this builder
         **/
        public Builder key(String key) {
            this.key = key;
            this.__explicitlySet__.add("key");
            return this;
        }
        /**
         * Name of the user that will be used to log in to the remote database or the remote or local operating system
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("userName")
        private String userName;

        /**
         * Name of the user that will be used to log in to the remote database or the remote or local operating system
         * @param userName the value to set
         * @return this builder
         **/
        public Builder userName(String userName) {
            this.userName = userName;
            this.__explicitlySet__.add("userName");
            return this;
        }
        /**
         * For a Windows target, the Windows domain to use when logging in
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("windowsDomain")
        private String windowsDomain;

        /**
         * For a Windows target, the Windows domain to use when logging in
         * @param windowsDomain the value to set
         * @return this builder
         **/
        public Builder windowsDomain(String windowsDomain) {
            this.windowsDomain = windowsDomain;
            this.__explicitlySet__.add("windowsDomain");
            return this;
        }
        /**
         * Indicates whether this credential is enabled (TRUE) or not (FALSE)
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("enabled")
        private String enabled;

        /**
         * Indicates whether this credential is enabled (TRUE) or not (FALSE)
         * @param enabled the value to set
         * @return this builder
         **/
        public Builder enabled(String enabled) {
            this.enabled = enabled;
            this.__explicitlySet__.add("enabled");
            return this;
        }
        /**
         * Indicates whether this refers to a public synonym or not.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("keyType")
        private CredentialKeyType keyType;

        /**
         * Indicates whether this refers to a public synonym or not.
         * @param keyType the value to set
         * @return this builder
         **/
        public Builder keyType(CredentialKeyType keyType) {
            this.keyType = keyType;
            this.__explicitlySet__.add("keyType");
            return this;
        }
        /**
         * Owner of the credential
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("owner")
        private String owner;

        /**
         * Owner of the credential
         * @param owner the value to set
         * @return this builder
         **/
        public Builder owner(String owner) {
            this.owner = owner;
            this.__explicitlySet__.add("owner");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
        private CredentialRelatedResource relatedResource;

        public Builder relatedResource(CredentialRelatedResource relatedResource) {
            this.relatedResource = relatedResource;
            this.__explicitlySet__.add("relatedResource");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public Credential build() {
            Credential model =
                    new Credential(
                            this.key,
                            this.userName,
                            this.windowsDomain,
                            this.enabled,
                            this.keyType,
                            this.owner,
                            this.relatedResource);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(Credential model) {
            if (model.wasPropertyExplicitlySet("key")) {
                this.key(model.getKey());
            }
            if (model.wasPropertyExplicitlySet("userName")) {
                this.userName(model.getUserName());
            }
            if (model.wasPropertyExplicitlySet("windowsDomain")) {
                this.windowsDomain(model.getWindowsDomain());
            }
            if (model.wasPropertyExplicitlySet("enabled")) {
                this.enabled(model.getEnabled());
            }
            if (model.wasPropertyExplicitlySet("keyType")) {
                this.keyType(model.getKeyType());
            }
            if (model.wasPropertyExplicitlySet("owner")) {
                this.owner(model.getOwner());
            }
            if (model.wasPropertyExplicitlySet("relatedResource")) {
                this.relatedResource(model.getRelatedResource());
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
     * Name of the credential
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("key")
    private final String key;

    /**
     * Name of the credential
     * @return the value
     **/
    public String getKey() {
        return key;
    }

    /**
     * Name of the user that will be used to log in to the remote database or the remote or local operating system
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("userName")
    private final String userName;

    /**
     * Name of the user that will be used to log in to the remote database or the remote or local operating system
     * @return the value
     **/
    public String getUserName() {
        return userName;
    }

    /**
     * For a Windows target, the Windows domain to use when logging in
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("windowsDomain")
    private final String windowsDomain;

    /**
     * For a Windows target, the Windows domain to use when logging in
     * @return the value
     **/
    public String getWindowsDomain() {
        return windowsDomain;
    }

    /**
     * Indicates whether this credential is enabled (TRUE) or not (FALSE)
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("enabled")
    private final String enabled;

    /**
     * Indicates whether this credential is enabled (TRUE) or not (FALSE)
     * @return the value
     **/
    public String getEnabled() {
        return enabled;
    }

    /**
     * Indicates whether this refers to a public synonym or not.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("keyType")
    private final CredentialKeyType keyType;

    /**
     * Indicates whether this refers to a public synonym or not.
     * @return the value
     **/
    public CredentialKeyType getKeyType() {
        return keyType;
    }

    /**
     * Owner of the credential
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("owner")
    private final String owner;

    /**
     * Owner of the credential
     * @return the value
     **/
    public String getOwner() {
        return owner;
    }

    @com.fasterxml.jackson.annotation.JsonProperty("relatedResource")
    private final CredentialRelatedResource relatedResource;

    public CredentialRelatedResource getRelatedResource() {
        return relatedResource;
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
        sb.append("Credential(");
        sb.append("super=").append(super.toString());
        sb.append("key=").append(String.valueOf(this.key));
        sb.append(", userName=").append(String.valueOf(this.userName));
        sb.append(", windowsDomain=").append(String.valueOf(this.windowsDomain));
        sb.append(", enabled=").append(String.valueOf(this.enabled));
        sb.append(", keyType=").append(String.valueOf(this.keyType));
        sb.append(", owner=").append(String.valueOf(this.owner));
        sb.append(", relatedResource=").append(String.valueOf(this.relatedResource));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof Credential)) {
            return false;
        }

        Credential other = (Credential) o;
        return java.util.Objects.equals(this.key, other.key)
                && java.util.Objects.equals(this.userName, other.userName)
                && java.util.Objects.equals(this.windowsDomain, other.windowsDomain)
                && java.util.Objects.equals(this.enabled, other.enabled)
                && java.util.Objects.equals(this.keyType, other.keyType)
                && java.util.Objects.equals(this.owner, other.owner)
                && java.util.Objects.equals(this.relatedResource, other.relatedResource)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.key == null ? 43 : this.key.hashCode());
        result = (result * PRIME) + (this.userName == null ? 43 : this.userName.hashCode());
        result =
                (result * PRIME)
                        + (this.windowsDomain == null ? 43 : this.windowsDomain.hashCode());
        result = (result * PRIME) + (this.enabled == null ? 43 : this.enabled.hashCode());
        result = (result * PRIME) + (this.keyType == null ? 43 : this.keyType.hashCode());
        result = (result * PRIME) + (this.owner == null ? 43 : this.owner.hashCode());
        result =
                (result * PRIME)
                        + (this.relatedResource == null ? 43 : this.relatedResource.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
