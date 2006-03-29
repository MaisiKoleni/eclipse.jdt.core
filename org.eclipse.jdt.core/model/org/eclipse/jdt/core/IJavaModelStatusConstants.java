/*******************************************************************************
 * Copyright (c) 2000, 2005 IBM Corporation and others.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     IBM Corporation - initial API and implementation
 * 
 * TODO missing 2.1 and subsequent contributions
 * COMPILER_FAILURE
 *******************************************************************************/
package org.eclipse.jdt.core;

/**
 * Status codes used with Java model status objects.
 * <p>
 * This interface declares constants only; it is not intended to be implemented
 * or extended.
 * </p>
 *
 * @see IJavaModelStatus
 * @see org.eclipse.core.runtime.IStatus#getCode()
 */
public interface IJavaModelStatusConstants {

	/**
	 * Status constant indicating that a container path was resolved
	 * to invalid entries (null or container).
	 * 
	 * @since 2.0
	 */
	public static final int INVALID_CP_CONTAINER_ENTRY = 962;

	/**
	 * Status constant indicating that a container path was not resolvable
	 * indicating either the referred container is undefined, unbound.
	 * 
	 * @since 2.0
	 */
	public static final int CP_CONTAINER_PATH_UNBOUND = 963;

	/**
	 * Status constant indicating that a classpath entry was invalid
	 */
	public static final int INVALID_CLASSPATH = 964;

	/**
	 * Status constant indicating that a variable path was not resolvable
	 * indicating either the referred variable is undefined, unbound or the resolved
	 * variable path does not correspond to an existing file or folder.
	 */
	public static final int CP_VARIABLE_PATH_UNBOUND = 965;

	/**
	 * Status constant indicating a core exception occurred.
	 * Use <code>getException</code> to retrieve a <code>CoreException</code>.
	 */
	public static final int CORE_EXCEPTION = 966;
    
	/**
	 * Status constant indicating one or more of the elements
	 * supplied are not of a valid type for the operation to
	 * process. 
	 * The element(s) can be retrieved using <code>getElements</code> on the status object.
	 */
	public static final int INVALID_ELEMENT_TYPES = 967;

	/**
	 * Status constant indicating that no elements were
	 * provided to the operation for processing.
	 */
	public static final int NO_ELEMENTS_TO_PROCESS = 968;

	/**
	 * Status constant indicating that one or more elements
	 * supplied do not exist. 
	 * The element(s) can be retrieved using <code>getElements</code> on the status object.
	 *
	 * @see IJavaModelStatus#isDoesNotExist()
	 */
	public static final int ELEMENT_DOES_NOT_EXIST = 969;

	/**
	 * Status constant indicating that a <code>null</code> path was
	 * supplied to the operation.
	 */
	public static final int NULL_PATH = 970;
    
	/**
	 * Status constant indicating that a path outside of the
	 * project was supplied to the operation. The path can be retrieved using 
	 * <code>getPath</code> on the status object.
	 */
	public static final int PATH_OUTSIDE_PROJECT = 971;
    
	/**
	 * Status constant indicating that a relative path 
	 * was supplied to the operation when an absolute path is
	 * required. The path can be retrieved using <code>getPath</code> on the
	 * status object.
	 */
	public static final int RELATIVE_PATH = 972;
    
	/**
	 * Status constant indicating that a path specifying a device
	 * was supplied to the operation when a path with no device is
	 * required. The path can be retrieved using <code>getPath</code> on the
	 * status object.
	 */
	public static final int DEVICE_PATH = 973;
    
	/**
	 * Status constant indicating that a string
	 * was supplied to the operation that was <code>null</code>.
	 */
	public static final int NULL_STRING = 974;
    
	/**
	 * Status constant indicating that the operation encountered
	 * a read-only element.
	 * The element(s) can be retrieved using <code>getElements</code> on the status object.
	 */
	public static final int READ_ONLY = 976;
    
	/**
	 * Status constant indicating that a naming collision would occur
	 * if the operation proceeded.
	 */
	public static final int NAME_COLLISION = 977;
    
	/**
	 * Status constant indicating that a destination provided for a copy/move/rename operation 
	 * is invalid. 
	 * The destination element can be retrieved using <code>getElements</code> on the status object.
	 */
	public static final int INVALID_DESTINATION = 978;
    
	/**
	 * Status constant indicating that a path provided to an operation 
	 * is invalid. The path can be retrieved using <code>getPath</code> on the
	 * status object.
	 */
	public static final int INVALID_PATH = 979;
    
	/**
	 * Status constant indicating the given source position is out of bounds.
	 */
	public static final int INDEX_OUT_OF_BOUNDS = 980;
    
	/**
	 * Status constant indicating there is an update conflict
	 * for a working copy. The compilation unit on which the
	 * working copy is based has changed since the working copy
	 * was created.
	 */
	public static final int UPDATE_CONFLICT = 981;

	/**
	 * Status constant indicating that <code>null</code> was specified
	 * as a name argument.
	 */
	public static final int NULL_NAME = 982;

	/**
	 * Status constant indicating that a name provided is not syntactically correct.
	 * The name can be retrieved from <code>getString</code>.
	 */
	public static final int INVALID_NAME = 983;

	/**
	 * Status constant indicating that the specified contents
	 * are not valid.
	 */
	public static final int INVALID_CONTENTS = 984;

	/**
	 * Status constant indicating that an <code>java.io.IOException</code>
	 * occurred. 
	 */
	public static final int IO_EXCEPTION = 985;

	/**
	 * Status constant indicating that a <code>DOMException</code>
	 * occurred. 
	 */
	public static final int DOM_EXCEPTION = 986;

	/**
	 * Status constant indicating that a <code>TargetException</code>
	 * occurred. 
	 */
	public static final int TARGET_EXCEPTION = 987;

	/**
	 * Status constant indicating that the Java builder
	 * could not be initialized.
	 */
	public static final int BUILDER_INITIALIZATION_ERROR = 990;

	/**
	 * Status constant indicating that the Java builder's last built state
	 * could not be serialized or deserialized.
	 */
	public static final int BUILDER_SERIALIZATION_ERROR = 991;

	/**
	 * Status constant indicating that an error was encountered while
	 * trying to evaluate a code snippet, or other item.
	 */
	public static final int EVALUATION_ERROR = 992;

	/**
	 * Status constant indicating that a sibling specified is not valid.
	 */
	public static final int INVALID_SIBLING = 993;

	/**
	 * Status indicating that a Java element could not be created because
	 * the underlying resource is invalid.
	 * @see JavaCore
	 */
	 public static final int INVALID_RESOURCE = 995;

	/**
	 * Status indicating that a Java element could not be created because
	 * the underlying resource is not of an appropriate type.
	 * @see JavaCore
	 */
	 public static final int INVALID_RESOURCE_TYPE = 996;

	/**
	 * Status indicating that a Java element could not be created because
	 * the project owning underlying resource does not have the Java nature.
	 * @see JavaCore
	 */
	 public static final int INVALID_PROJECT = 997;

	/**
	 * Status indicating that the package declaration in a <code>ICompilationUnit</code>
	 * does not correspond to the <code>IPackageFragment</code> it belongs to.
	 * The <code>getString</code> method of the associated status object
	 * gives the name of the package in which the <code>ICompilationUnit</code> is
	 * declared.
	 */
	 public static final int INVALID_PACKAGE = 998;

	/**
	 * Status indicating that the corresponding resource has no local contents yet.
	 * This might happen when attempting to use a resource before its contents
	 * has been made locally available.
	 */
	 public static final int NO_LOCAL_CONTENTS = 999;
	 
	 /**
	  * Status indicating that a .classpath file is ill-formed, and thus cannot
	  * be read/written successfully.
	  * @since 2.1
	  */
	 public static final int INVALID_CLASSPATH_FILE_FORMAT = 1000;

	 /**
	  * Status indicating that a project is involved in a build path cycle.
	  * @since 2.1
	  */
	 public static final int CLASSPATH_CYCLE = 1001;
	 
	/**
	 * Status constant indicating that an inclusion or an exclusion pattern got specified
	 * on a classpath source entry, though it was explicitely disabled 
	 * according to its project preference settings.
	 * @see org.eclipse.jdt.core.IJavaProject#getOptions(boolean)
	 * @since 2.1
	 */
	public static final int DISABLED_CP_EXCLUSION_PATTERNS = 1002;

	/**
	 * Status constant indicating that a specific output location got associated
	 * with a source entry, though it was explicitely disabled according to its project
	 * preference settings.
	 * @see org.eclipse.jdt.core.IJavaProject#getOptions(boolean)
	 * @since 2.1
	 */
	public static final int DISABLED_CP_MULTIPLE_OUTPUT_LOCATIONS = 1003;
	
	/**
	 * Status constant indicating that a project is prerequisiting some library for which the
	 * classfile JDK version level is more recent than the project JDK target level setting. 
	 * This can indicate some binary incompatibility issues later on.
	 * @since 3.0
	 */
	public static final int INCOMPATIBLE_JDK_LEVEL	= 1004;
	
	/**
	 * Status constant indicating that a compiler failure occurred.
	 * @since 3.0
	 */
	public static final int COMPILER_FAILURE	= 1005;	
	/**
	 * Status constant indicating that an element is not on its project's claspath.
	 * @since 3.1
	 */
	public static final int ELEMENT_NOT_ON_CLASSPATH	= 1006;	
	/**
	 * Status constant indicating that a compiler option is invalid.
	 * @since 3.1
	 */
//	public static final int INVALID_COMPILER_OPTION = 1007;
	/**
	 * <p>Status constant indicating that the attached javadoc content cannot be retrieved due to multiple reasons:
	 * invalid url, timed-out,...</p>
	 * 
	 * @since 3.2
	 */
	public static final int CANNOT_RETRIEVE_ATTACHED_JAVADOC = 1008;
	/**
	 * <p>Status constant indicating that the attached javadoc content format is unrecognized.</p>
	 * 
	 * @since 3.2
	 */
	public static final int UNKNOWN_JAVADOC_FORMAT = 1009;
}
