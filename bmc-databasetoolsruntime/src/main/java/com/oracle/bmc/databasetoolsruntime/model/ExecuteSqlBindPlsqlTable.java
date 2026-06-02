/**
 * Copyright (c) 2016, 2026, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc.databasetoolsruntime.model;

/**
 * PL/SQL table type details
 * <br/>
 * Note: Objects should always be created or deserialized using the {@link Builder}. This model distinguishes fields
 * that are {@code null} because they are unset from fields that are explicitly set to {@code null}. This is done in
 * the setter methods of the {@link Builder}, which maintain a set of all explicitly set fields called
 * {@link #__explicitlySet__}. The {@link #hashCode()} and {@link #equals(Object)} methods are implemented to take
 * {@link #__explicitlySet__} into account. The constructor, on the other hand, does not set {@link #__explicitlySet__}
 * (since the constructor cannot distinguish explicit {@code null} from unset {@code null}).
 **/
@javax.annotation.Generated(value = "OracleSDKGenerator", comments = "API Version: 20230222")
@com.fasterxml.jackson.databind.annotation.JsonDeserialize(
    builder = ExecuteSqlBindPlsqlTable.Builder.class
)
@com.fasterxml.jackson.annotation.JsonFilter(com.oracle.bmc.http.internal.ExplicitlySetFilter.NAME)
public final class ExecuteSqlBindPlsqlTable
        extends com.oracle.bmc.http.internal.ExplicitlySetBmcModel {
    @Deprecated
    @java.beans.ConstructorProperties({"typeName", "typeSubname", "typeComponents"})
    public ExecuteSqlBindPlsqlTable(
            String typeName,
            String typeSubname,
            java.util.List<ExecuteSqlBindTypeComponent> typeComponents) {
        super();
        this.typeName = typeName;
        this.typeSubname = typeSubname;
        this.typeComponents = typeComponents;
    }

    @com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder(withPrefix = "")
    public static class Builder {
        /**
         * Only an empty string is accepted as the value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeName")
        private String typeName;

        /**
         * Only an empty string is accepted as the value.
         * @param typeName the value to set
         * @return this builder
         **/
        public Builder typeName(String typeName) {
            this.typeName = typeName;
            this.__explicitlySet__.add("typeName");
            return this;
        }
        /**
         * Only an empty string is accepted as the value.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeSubname")
        private String typeSubname;

        /**
         * Only an empty string is accepted as the value.
         * @param typeSubname the value to set
         * @return this builder
         **/
        public Builder typeSubname(String typeSubname) {
            this.typeSubname = typeSubname;
            this.__explicitlySet__.add("typeSubname");
            return this;
        }
        /**
         * Specifies an array of data types in the PL/SQL table.
         **/
        @com.fasterxml.jackson.annotation.JsonProperty("typeComponents")
        private java.util.List<ExecuteSqlBindTypeComponent> typeComponents;

        /**
         * Specifies an array of data types in the PL/SQL table.
         * @param typeComponents the value to set
         * @return this builder
         **/
        public Builder typeComponents(java.util.List<ExecuteSqlBindTypeComponent> typeComponents) {
            this.typeComponents = typeComponents;
            this.__explicitlySet__.add("typeComponents");
            return this;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        private final java.util.Set<String> __explicitlySet__ = new java.util.HashSet<String>();

        public ExecuteSqlBindPlsqlTable build() {
            ExecuteSqlBindPlsqlTable model =
                    new ExecuteSqlBindPlsqlTable(
                            this.typeName, this.typeSubname, this.typeComponents);
            for (String explicitlySetProperty : this.__explicitlySet__) {
                model.markPropertyAsExplicitlySet(explicitlySetProperty);
            }
            return model;
        }

        @com.fasterxml.jackson.annotation.JsonIgnore
        public Builder copy(ExecuteSqlBindPlsqlTable model) {
            if (model.wasPropertyExplicitlySet("typeName")) {
                this.typeName(model.getTypeName());
            }
            if (model.wasPropertyExplicitlySet("typeSubname")) {
                this.typeSubname(model.getTypeSubname());
            }
            if (model.wasPropertyExplicitlySet("typeComponents")) {
                this.typeComponents(model.getTypeComponents());
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
     * Only an empty string is accepted as the value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeName")
    private final String typeName;

    /**
     * Only an empty string is accepted as the value.
     * @return the value
     **/
    public String getTypeName() {
        return typeName;
    }

    /**
     * Only an empty string is accepted as the value.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeSubname")
    private final String typeSubname;

    /**
     * Only an empty string is accepted as the value.
     * @return the value
     **/
    public String getTypeSubname() {
        return typeSubname;
    }

    /**
     * Specifies an array of data types in the PL/SQL table.
     **/
    @com.fasterxml.jackson.annotation.JsonProperty("typeComponents")
    private final java.util.List<ExecuteSqlBindTypeComponent> typeComponents;

    /**
     * Specifies an array of data types in the PL/SQL table.
     * @return the value
     **/
    public java.util.List<ExecuteSqlBindTypeComponent> getTypeComponents() {
        return typeComponents;
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
        sb.append("ExecuteSqlBindPlsqlTable(");
        sb.append("super=").append(super.toString());
        sb.append("typeName=").append(String.valueOf(this.typeName));
        sb.append(", typeSubname=").append(String.valueOf(this.typeSubname));
        sb.append(", typeComponents=").append(String.valueOf(this.typeComponents));
        sb.append(")");
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof ExecuteSqlBindPlsqlTable)) {
            return false;
        }

        ExecuteSqlBindPlsqlTable other = (ExecuteSqlBindPlsqlTable) o;
        return java.util.Objects.equals(this.typeName, other.typeName)
                && java.util.Objects.equals(this.typeSubname, other.typeSubname)
                && java.util.Objects.equals(this.typeComponents, other.typeComponents)
                && super.equals(other);
    }

    @Override
    public int hashCode() {
        final int PRIME = 59;
        int result = 1;
        result = (result * PRIME) + (this.typeName == null ? 43 : this.typeName.hashCode());
        result = (result * PRIME) + (this.typeSubname == null ? 43 : this.typeSubname.hashCode());
        result =
                (result * PRIME)
                        + (this.typeComponents == null ? 43 : this.typeComponents.hashCode());
        result = (result * PRIME) + super.hashCode();
        return result;
    }
}
