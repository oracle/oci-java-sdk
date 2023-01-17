/**
 * Copyright (c) 2016, 2023, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.dataintegration.model;

/**
 * The information about the application. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link #__explicitlySet__}. The {@link #hashCode()} and
 * {@link #equals(Object)} methods are implemented to take {@link #__explicitlySet__} into account.
 * The constructor, on the other hand, does not set {@link #__explicitlySet__} (since the
 * constructor cannot distinguish explicit {@code null} from unset {@code null}).
 */
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20200430")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
        builder = CreateSourceApplicationInfo.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetFilter.NAME)
public final class CreateSourceApplicationInfo
        extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"workspaceId", "applicationKey", "copyType"})
    public CreateSourceApplicationInfo(
            String workspaceId, String applicationKey, CopyType copyType) {
        super();
        this.workspaceId = workspaceId;
        this.applicationKey = applicationKey;
        this.copyType = copyType;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * The OCID of the workspace containing the application. This allows cross workspace
         * deployment to publish an application from a different workspace into the current
         * workspace specified in this operation.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
        private String workspaceId;

        /**
         * The OCID of the workspace containing the application. This allows cross workspace
         * deployment to publish an application from a different workspace into the current
         * workspace specified in this operation.
         *
         * @param workspaceId the value to set
         * @return this builder
         */
        public Builder workspaceId(String workspaceId) {
            this.workspaceId = workspaceId;
            this.__explicitlySet__.add("workspaceId");
            return this;
        }
        /** The source application key to use when creating the application. */
        @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
        private String applicationKey;

        /**
         * The source application key to use when creating the application.
         *
         * @param applicationKey the value to set
         * @return this builder
         */
        public Builder applicationKey(String applicationKey) {
            this.applicationKey = applicationKey;
            this.__explicitlySet__.add("applicationKey");
            return this;
        }
        /**
         * Parameter to specify the link between SOURCE and TARGET application after copying.
         * CONNECTED - Indicate that TARGET application is conneced to SOURCE and can be synced
         * after copy. DISCONNECTED - Indicate that TARGET application is not conneced to SOURCE and
         * can evolve independently.
         */
        @com.fasterxml.jackson.annotation.JsonProperty("copyType")
        private CopyType copyType;

        /**
         * Parameter to specify the link between SOURCE and TARGET application after copying.
         * CONNECTED - Indicate that TARGET application is conneced to SOURCE and can be synced
         * after copy. DISCONNECTED - Indicate that TARGET application is not conneced to SOURCE and
         * can evolve independently.
         *
         * @param copyType the value to set
         * @return this builder
         */
        public Builder copyType(CopyType copyType) {
            this.copyType = copyType;
            this.__explicitlySet__.add("copyType");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public CreateSourceApplicationInfo build() {
            CreateSourceApplicationInfo model =
                    new CreateSourceApplicationInfo(
                            this.workspaceId, this.applicationKey, this.copyType);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(CreateSourceApplicationInfo model) {
            if (model.wasPropertyExplicitlySet("workspaceId")) {
                this.workspaceId(model.getWorkspaceId());
            }
            if (model.wasPropertyExplicitlySet("applicationKey")) {
                this.applicationKey(model.getApplicationKey());
            }
            if (model.wasPropertyExplicitlySet("copyType")) {
                this.copyType(model.getCopyType());
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
     * The OCID of the workspace containing the application. This allows cross workspace deployment
     * to publish an application from a different workspace into the current workspace specified in
     * this operation.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("workspaceId")
    private final String workspaceId;

    /**
     * The OCID of the workspace containing the application. This allows cross workspace deployment
     * to publish an application from a different workspace into the current workspace specified in
     * this operation.
     *
     * @return the value
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    /** The source application key to use when creating the application. */
    @com.fasterxml.jackson.annotation.JsonProperty("applicationKey")
    private final String applicationKey;

    /**
     * The source application key to use when creating the application.
     *
     * @return the value
     */
    public String getApplicationKey() {
        return applicationKey;
    }

    /**
     * Parameter to specify the link between SOURCE and TARGET application after copying. CONNECTED
     * - Indicate that TARGET application is conneced to SOURCE and can be synced after copy.
     * DISCONNECTED - Indicate that TARGET application is not conneced to SOURCE and can evolve
     * independently.
     */
    public enum CopyType implements com.oracle.bmc.http.internal.BmcEnum {
        Connected("CONNECTED"),
        Disconnected("DISCONNECTED"),
        ;

        private final String value;
        private static java.util.Map<String, CopyType> map;

        static {
            map = new java.util.HashMap<>();
            for (CopyType v : CopyType.values()) {
                map.put(v.getValue(), v);
            }
        }

        CopyType(String value) {
            this.value = value;
        }

        @com.fasterxml.jackson.annotation.JsonValue
        public String getValue() {
            return value;
        }

        @com.fasterxml.jackson.annotation.JsonCreator
        public static CopyType create(String key) {
            if (map.containsKey(key)) {
                return map.get(key);
            }
            throw new IllegalArgumentException("Invalid CopyType: " + key);
        }
    };
    /**
     * Parameter to specify the link between SOURCE and TARGET application after copying. CONNECTED
     * - Indicate that TARGET application is conneced to SOURCE and can be synced after copy.
     * DISCONNECTED - Indicate that TARGET application is not conneced to SOURCE and can evolve
     * independently.
     */
    @com.fasterxml.jackson.annotation.JsonProperty("copyType")
    private final CopyType copyType;

    /**
     * Parameter to specify the link between SOURCE and TARGET application after copying. CONNECTED
     * - Indicate that TARGET application is conneced to SOURCE and can be synced after copy.
     * DISCONNECTED - Indicate that TARGET application is not conneced to SOURCE and can evolve
     * independently.
     *
     * @return the value
     */
    public CopyType getCopyType() {
        return copyType;
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
        sb.append("CreateSourceApplicationInfo(");
        sb.append("super=").append(super.toString());
        sb.append("workspaceId=").append(String.valueOf(this.workspaceId));
        sb.append(", applicationKey=").append(String.valueOf(this.applicationKey));
        sb.append(", copyType=").append(String.valueOf(this.copyType));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof CreateSourceApplicationInfo)) {
            return false;
        }

        CreateSourceApplicationInfo other = (CreateSourceApplicationInfo) o;
        return java.util.Objects.equals(this.workspaceId, other.workspaceId)
                && java.util.Objects.equals(this.applicationKey, other.applicationKey)
                && java.util.Objects.equals(this.copyType, other.copyType)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.workspaceId == null ? 43 : this.workspaceId.hashCode());
        result =
                (result * PRIME)
                        + (this.applicationKey == null ? 43 : this.applicationKey.hashCode());
        result = (result * PRIME) + (this.copyType == null ? 43 : this.copyType.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
