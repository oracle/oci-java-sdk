/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.cloudbridge.model;

/**
 * Type representing a fence agent. <br>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model
 * distinguishes fields that are {@code null} because they are unset from fields that are explicitly
 * set to {@code null}. This is done in the setter methods of the {@link Builder}, which maintain a
 * set of all explicitly set fields called {@link Builder#__explicitlySet__}. The {@link
 * #hashCode()} and {@link #equals(Object)} methods are implemented to take the explicitly set
 * fields into account. The constructor, on the other hand, does not take the explicitly set fields
 * into account (since the constructor cannot distinguish explicit {@code null} from unset {@code
 * null}).
 */
@jakarta.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20220509")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(builder = OlvmAgent.Builder.class)
@com.fasterxml.jackson.annotation.JsonFilter(
        com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel.EXPLICITLY_SET_FILTER_NAME)
public final class OlvmAgent extends com.oracle.bmc.http.client.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({
        "address",
        "comment",
        "isConcurrent",
        "description",
        "isEncryptOptions",
        "id",
        "name",
        "order",
        "port",
        "type",
        "username"
    })
    public OlvmAgent(
            String address,
            String comment,
            Boolean isConcurrent,
            String description,
            Boolean isEncryptOptions,
            String id,
            String name,
            Integer order,
            Integer port,
            String type,
            String username) {
        super();
        this.address = address;
        this.comment = comment;
        this.isConcurrent = isConcurrent;
        this.description = description;
        this.isEncryptOptions = isEncryptOptions;
        this.id = id;
        this.name = name;
        this.order = order;
        this.port = port;
        this.type = type;
        this.username = username;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /** Fence agent address */
        @com.fasterxml.jackson.annotation.JsonProperty("address")
        private String address;

        /**
         * Fence agent address
         *
         * @param address the value to set
         * @return this builder
         */
        public Builder address(String address) {
            this.address = address;
            this.__explicitlySet__.add("address");
            return this;
        }
        /** Free text containing comments about this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("comment")
        private String comment;

        /**
         * Free text containing comments about this object.
         *
         * @param comment the value to set
         * @return this builder
         */
        public Builder comment(String comment) {
            this.comment = comment;
            this.__explicitlySet__.add("comment");
            return this;
        }
        /** Specified whether the agent should be used concurrently or sequentially */
        @com.fasterxml.jackson.annotation.JsonProperty("isConcurrent")
        private Boolean isConcurrent;

        /**
         * Specified whether the agent should be used concurrently or sequentially
         *
         * @param isConcurrent the value to set
         * @return this builder
         */
        public Builder isConcurrent(Boolean isConcurrent) {
            this.isConcurrent = isConcurrent;
            this.__explicitlySet__.add("isConcurrent");
            return this;
        }
        /** Free text containing comments about this object. */
        @com.fasterxml.jackson.annotation.JsonProperty("description")
        private String description;

        /**
         * Free text containing comments about this object.
         *
         * @param description the value to set
         * @return this builder
         */
        public Builder description(String description) {
            this.description = description;
            this.__explicitlySet__.add("description");
            return this;
        }
        /** Specifies whether the options should be encrypted. */
        @com.fasterxml.jackson.annotation.JsonProperty("isEncryptOptions")
        private Boolean isEncryptOptions;

        /**
         * Specifies whether the options should be encrypted.
         *
         * @param isEncryptOptions the value to set
         * @return this builder
         */
        public Builder isEncryptOptions(Boolean isEncryptOptions) {
            this.isEncryptOptions = isEncryptOptions;
            this.__explicitlySet__.add("isEncryptOptions");
            return this;
        }
        /** A unique identifier. */
        @com.fasterxml.jackson.annotation.JsonProperty("id")
        private String id;

        /**
         * A unique identifier.
         *
         * @param id the value to set
         * @return this builder
         */
        public Builder id(String id) {
            this.id = id;
            this.__explicitlySet__.add("id");
            return this;
        }
        /** A human-readable name in plain text */
        @com.fasterxml.jackson.annotation.JsonProperty("name")
        private String name;

        /**
         * A human-readable name in plain text
         *
         * @param name the value to set
         * @return this builder
         */
        public Builder name(String name) {
            this.name = name;
            this.__explicitlySet__.add("name");
            return this;
        }
        /** The order of this agent if used with other agents. */
        @com.fasterxml.jackson.annotation.JsonProperty("order")
        private Integer order;

        /**
         * The order of this agent if used with other agents.
         *
         * @param order the value to set
         * @return this builder
         */
        public Builder order(Integer order) {
            this.order = order;
            this.__explicitlySet__.add("order");
            return this;
        }
        /** Fence agent port. */
        @com.fasterxml.jackson.annotation.JsonProperty("port")
        private Integer port;

        /**
         * Fence agent port.
         *
         * @param port the value to set
         * @return this builder
         */
        public Builder port(Integer port) {
            this.port = port;
            this.__explicitlySet__.add("port");
            return this;
        }
        /** Fence agent type. */
        @com.fasterxml.jackson.annotation.JsonProperty("type")
        private String type;

        /**
         * Fence agent type.
         *
         * @param type the value to set
         * @return this builder
         */
        public Builder type(String type) {
            this.type = type;
            this.__explicitlySet__.add("type");
            return this;
        }
        /** Fence agent user name. */
        @com.fasterxml.jackson.annotation.JsonProperty("username")
        private String username;

        /**
         * Fence agent user name.
         *
         * @param username the value to set
         * @return this builder
         */
        public Builder username(String username) {
            this.username = username;
            this.__explicitlySet__.add("username");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public OlvmAgent build() {
            OlvmAgent model =
                    new OlvmAgent(
                            this.address,
                            this.comment,
                            this.isConcurrent,
                            this.description,
                            this.isEncryptOptions,
                            this.id,
                            this.name,
                            this.order,
                            this.port,
                            this.type,
                            this.username);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(OlvmAgent model) {
            if (model.wasPropertyExplicitlySet("address")) {
                this.address(model.getAddress());
            }
            if (model.wasPropertyExplicitlySet("comment")) {
                this.comment(model.getComment());
            }
            if (model.wasPropertyExplicitlySet("isConcurrent")) {
                this.isConcurrent(model.getIsConcurrent());
            }
            if (model.wasPropertyExplicitlySet("description")) {
                this.description(model.getDescription());
            }
            if (model.wasPropertyExplicitlySet("isEncryptOptions")) {
                this.isEncryptOptions(model.getIsEncryptOptions());
            }
            if (model.wasPropertyExplicitlySet("id")) {
                this.id(model.getId());
            }
            if (model.wasPropertyExplicitlySet("name")) {
                this.name(model.getName());
            }
            if (model.wasPropertyExplicitlySet("order")) {
                this.order(model.getOrder());
            }
            if (model.wasPropertyExplicitlySet("port")) {
                this.port(model.getPort());
            }
            if (model.wasPropertyExplicitlySet("type")) {
                this.type(model.getType());
            }
            if (model.wasPropertyExplicitlySet("username")) {
                this.username(model.getUsername());
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

    /** Fence agent address */
    @com.fasterxml.jackson.annotation.JsonProperty("address")
    private final String address;

    /**
     * Fence agent address
     *
     * @return the value
     */
    public String getAddress() {
        return address;
    }

    /** Free text containing comments about this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("comment")
    private final String comment;

    /**
     * Free text containing comments about this object.
     *
     * @return the value
     */
    public String getComment() {
        return comment;
    }

    /** Specified whether the agent should be used concurrently or sequentially */
    @com.fasterxml.jackson.annotation.JsonProperty("isConcurrent")
    private final Boolean isConcurrent;

    /**
     * Specified whether the agent should be used concurrently or sequentially
     *
     * @return the value
     */
    public Boolean getIsConcurrent() {
        return isConcurrent;
    }

    /** Free text containing comments about this object. */
    @com.fasterxml.jackson.annotation.JsonProperty("description")
    private final String description;

    /**
     * Free text containing comments about this object.
     *
     * @return the value
     */
    public String getDescription() {
        return description;
    }

    /** Specifies whether the options should be encrypted. */
    @com.fasterxml.jackson.annotation.JsonProperty("isEncryptOptions")
    private final Boolean isEncryptOptions;

    /**
     * Specifies whether the options should be encrypted.
     *
     * @return the value
     */
    public Boolean getIsEncryptOptions() {
        return isEncryptOptions;
    }

    /** A unique identifier. */
    @com.fasterxml.jackson.annotation.JsonProperty("id")
    private final String id;

    /**
     * A unique identifier.
     *
     * @return the value
     */
    public String getId() {
        return id;
    }

    /** A human-readable name in plain text */
    @com.fasterxml.jackson.annotation.JsonProperty("name")
    private final String name;

    /**
     * A human-readable name in plain text
     *
     * @return the value
     */
    public String getName() {
        return name;
    }

    /** The order of this agent if used with other agents. */
    @com.fasterxml.jackson.annotation.JsonProperty("order")
    private final Integer order;

    /**
     * The order of this agent if used with other agents.
     *
     * @return the value
     */
    public Integer getOrder() {
        return order;
    }

    /** Fence agent port. */
    @com.fasterxml.jackson.annotation.JsonProperty("port")
    private final Integer port;

    /**
     * Fence agent port.
     *
     * @return the value
     */
    public Integer getPort() {
        return port;
    }

    /** Fence agent type. */
    @com.fasterxml.jackson.annotation.JsonProperty("type")
    private final String type;

    /**
     * Fence agent type.
     *
     * @return the value
     */
    public String getType() {
        return type;
    }

    /** Fence agent user name. */
    @com.fasterxml.jackson.annotation.JsonProperty("username")
    private final String username;

    /**
     * Fence agent user name.
     *
     * @return the value
     */
    public String getUsername() {
        return username;
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
        sb.append("OlvmAgent(");
        sb.append("super=").append(super.toString());
        sb.append("address=").append(String.valueOf(this.address));
        sb.append(", comment=").append(String.valueOf(this.comment));
        sb.append(", isConcurrent=").append(String.valueOf(this.isConcurrent));
        sb.append(", description=").append(String.valueOf(this.description));
        sb.append(", isEncryptOptions=").append(String.valueOf(this.isEncryptOptions));
        sb.append(", id=").append(String.valueOf(this.id));
        sb.append(", name=").append(String.valueOf(this.name));
        sb.append(", order=").append(String.valueOf(this.order));
        sb.append(", port=").append(String.valueOf(this.port));
        sb.append(", type=").append(String.valueOf(this.type));
        sb.append(", username=").append(String.valueOf(this.username));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof OlvmAgent)) {
            return false;
        }

        OlvmAgent other = (OlvmAgent) o;
        return java.util.Objects.equals(this.address, other.address)
                && java.util.Objects.equals(this.comment, other.comment)
                && java.util.Objects.equals(this.isConcurrent, other.isConcurrent)
                && java.util.Objects.equals(this.description, other.description)
                && java.util.Objects.equals(this.isEncryptOptions, other.isEncryptOptions)
                && java.util.Objects.equals(this.id, other.id)
                && java.util.Objects.equals(this.name, other.name)
                && java.util.Objects.equals(this.order, other.order)
                && java.util.Objects.equals(this.port, other.port)
                && java.util.Objects.equals(this.type, other.type)
                && java.util.Objects.equals(this.username, other.username)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.address == null ? 43 : this.address.hashCode());
        result = (result * PRIME) + (this.comment == null ? 43 : this.comment.hashCode());
        result = (result * PRIME) + (this.isConcurrent == null ? 43 : this.isConcurrent.hashCode());
        result = (result * PRIME) + (this.description == null ? 43 : this.description.hashCode());
        result =
                (result * PRIME)
                        + (this.isEncryptOptions == null ? 43 : this.isEncryptOptions.hashCode());
        result = (result * PRIME) + (this.id == null ? 43 : this.id.hashCode());
        result = (result * PRIME) + (this.name == null ? 43 : this.name.hashCode());
        result = (result * PRIME) + (this.order == null ? 43 : this.order.hashCode());
        result = (result * PRIME) + (this.port == null ? 43 : this.port.hashCode());
        result = (result * PRIME) + (this.type == null ? 43 : this.type.hashCode());
        result = (result * PRIME) + (this.username == null ? 43 : this.username.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
