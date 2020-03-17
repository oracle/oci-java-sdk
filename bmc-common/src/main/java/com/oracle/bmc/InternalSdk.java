/**
 * Copyright (c) 2016, 2020, Oracle and/or its affiliates. All rights reserved.
 */
package com.oracle.bmc;

/**
 * Annotation to indicate a class or method is only meant for internal SDK usage, and may break/change without
 * notice.
 * <p>
 * Classes or methods with this annotation generally appear in non-'internal' packages so that they show up for
 * documentation but are not intended to for consumers to actually use.
 * <p>
 * Note, by convention, any class with 'internal' in the package name is not intended for consumers
 * to directly use, regardless of whether or not it contains this annotation.
 */
public @interface InternalSdk {}
