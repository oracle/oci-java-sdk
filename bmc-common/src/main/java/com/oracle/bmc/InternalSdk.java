/**
 * Copyright (c) 2016, 2024, Oracle and/or its affiliates.  All rights reserved.
 * This software is dual-licensed to you under the Universal Permissive License (UPL) 1.0 as shown at https://oss.oracle.com/licenses/upl or Apache License 2.0 as shown at http://www.apache.org/licenses/LICENSE-2.0. You may choose either license.
 */
package com.oracle.bmc;

/**
 * Annotation to indicate a class or method is only meant for internal SDK usage, and may
 * break/change without notice.
 *
 * <p>Classes or methods with this annotation generally appear in non-'internal' packages so that
 * they show up for documentation but are not intended to for consumers to actually use.
 *
 * <p>Note, by convention, any class with 'internal' in the package name is not intended for
 * consumers to directly use, regardless of whether or not it contains this annotation.
 */
public @interface InternalSdk {
    /**
     * If set to true, backward compatibility should be maintained, even though this is internal SDK
     * code.
     *
     * @return true if backward compatibility should be maintained
     */
    boolean backwardCompatibilityRequired() default false;
}
