/**
 * Copyright Israel Aerospace Industries, Eclipse contributors and others 2021. All rights reserved.
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     ELTA Ltd - initial API and implementation
 * 
 */
package dsm.oscal.model.Oscal.impl;

import dsm.oscal.model.Oscal.Annotation;
import dsm.oscal.model.Oscal.AnnotationOwner;
import dsm.oscal.model.Oscal.Link;
import dsm.oscal.model.Oscal.LinkOwner;
import dsm.oscal.model.Oscal.OscalPackage;
import dsm.oscal.model.Oscal.Partition;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Partition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getAnnotations <em>Annotations</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getLinks <em>Links</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getName <em>Name</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getId <em>Id</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getNs <em>Ns</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getClass_ <em>Class</em>}</li>
 *   <li>{@link dsm.oscal.model.Oscal.impl.PartitionImpl#getTitle <em>Title</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PartitionImpl extends PropertyOwnerImpl implements Partition {
	/**
	 * The cached value of the '{@link #getAnnotations() <em>Annotations</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAnnotations()
	 * @generated
	 * @ordered
	 */
	protected EList<Annotation> annotations;

	/**
	 * The cached value of the '{@link #getLinks() <em>Links</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLinks()
	 * @generated
	 * @ordered
	 */
	protected EList<Link> links;

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final String ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected String id = ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected static final String NS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNs() <em>Ns</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNs()
	 * @generated
	 * @ordered
	 */
	protected String ns = NS_EDEFAULT;

	/**
	 * The default value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected static final String CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getClass_() <em>Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClass_()
	 * @generated
	 * @ordered
	 */
	protected String class_ = CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected static final String TITLE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTitle() <em>Title</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTitle()
	 * @generated
	 * @ordered
	 */
	protected String title = TITLE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PartitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return OscalPackage.Literals.PARTITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Annotation> getAnnotations() {
		if (annotations == null) {
			annotations = new EObjectContainmentEList<Annotation>(Annotation.class, this,
					OscalPackage.PARTITION__ANNOTATIONS);
		}
		return annotations;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Link> getLinks() {
		if (links == null) {
			links = new EObjectContainmentEList<Link>(Link.class, this, OscalPackage.PARTITION__LINKS);
		}
		return links;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTITION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(String newId) {
		String oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTITION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getNs() {
		return ns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNs(String newNs) {
		String oldNs = ns;
		ns = newNs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTITION__NS, oldNs, ns));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getClass_() {
		return class_;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClass(String newClass) {
		String oldClass = class_;
		class_ = newClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTITION__CLASS, oldClass, class_));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTitle(String newTitle) {
		String oldTitle = title;
		title = newTitle;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, OscalPackage.PARTITION__TITLE, oldTitle, title));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case OscalPackage.PARTITION__ANNOTATIONS:
			return ((InternalEList<?>) getAnnotations()).basicRemove(otherEnd, msgs);
		case OscalPackage.PARTITION__LINKS:
			return ((InternalEList<?>) getLinks()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case OscalPackage.PARTITION__ANNOTATIONS:
			return getAnnotations();
		case OscalPackage.PARTITION__LINKS:
			return getLinks();
		case OscalPackage.PARTITION__NAME:
			return getName();
		case OscalPackage.PARTITION__ID:
			return getId();
		case OscalPackage.PARTITION__NS:
			return getNs();
		case OscalPackage.PARTITION__CLASS:
			return getClass_();
		case OscalPackage.PARTITION__TITLE:
			return getTitle();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case OscalPackage.PARTITION__ANNOTATIONS:
			getAnnotations().clear();
			getAnnotations().addAll((Collection<? extends Annotation>) newValue);
			return;
		case OscalPackage.PARTITION__LINKS:
			getLinks().clear();
			getLinks().addAll((Collection<? extends Link>) newValue);
			return;
		case OscalPackage.PARTITION__NAME:
			setName((String) newValue);
			return;
		case OscalPackage.PARTITION__ID:
			setId((String) newValue);
			return;
		case OscalPackage.PARTITION__NS:
			setNs((String) newValue);
			return;
		case OscalPackage.PARTITION__CLASS:
			setClass((String) newValue);
			return;
		case OscalPackage.PARTITION__TITLE:
			setTitle((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case OscalPackage.PARTITION__ANNOTATIONS:
			getAnnotations().clear();
			return;
		case OscalPackage.PARTITION__LINKS:
			getLinks().clear();
			return;
		case OscalPackage.PARTITION__NAME:
			setName(NAME_EDEFAULT);
			return;
		case OscalPackage.PARTITION__ID:
			setId(ID_EDEFAULT);
			return;
		case OscalPackage.PARTITION__NS:
			setNs(NS_EDEFAULT);
			return;
		case OscalPackage.PARTITION__CLASS:
			setClass(CLASS_EDEFAULT);
			return;
		case OscalPackage.PARTITION__TITLE:
			setTitle(TITLE_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case OscalPackage.PARTITION__ANNOTATIONS:
			return annotations != null && !annotations.isEmpty();
		case OscalPackage.PARTITION__LINKS:
			return links != null && !links.isEmpty();
		case OscalPackage.PARTITION__NAME:
			return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
		case OscalPackage.PARTITION__ID:
			return ID_EDEFAULT == null ? id != null : !ID_EDEFAULT.equals(id);
		case OscalPackage.PARTITION__NS:
			return NS_EDEFAULT == null ? ns != null : !NS_EDEFAULT.equals(ns);
		case OscalPackage.PARTITION__CLASS:
			return CLASS_EDEFAULT == null ? class_ != null : !CLASS_EDEFAULT.equals(class_);
		case OscalPackage.PARTITION__TITLE:
			return TITLE_EDEFAULT == null ? title != null : !TITLE_EDEFAULT.equals(title);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotationOwner.class) {
			switch (derivedFeatureID) {
			case OscalPackage.PARTITION__ANNOTATIONS:
				return OscalPackage.ANNOTATION_OWNER__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (derivedFeatureID) {
			case OscalPackage.PARTITION__LINKS:
				return OscalPackage.LINK_OWNER__LINKS;
			default:
				return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == AnnotationOwner.class) {
			switch (baseFeatureID) {
			case OscalPackage.ANNOTATION_OWNER__ANNOTATIONS:
				return OscalPackage.PARTITION__ANNOTATIONS;
			default:
				return -1;
			}
		}
		if (baseClass == LinkOwner.class) {
			switch (baseFeatureID) {
			case OscalPackage.LINK_OWNER__LINKS:
				return OscalPackage.PARTITION__LINKS;
			default:
				return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", id: ");
		result.append(id);
		result.append(", ns: ");
		result.append(ns);
		result.append(", class: ");
		result.append(class_);
		result.append(", title: ");
		result.append(title);
		result.append(')');
		return result.toString();
	}

} //PartitionImpl
