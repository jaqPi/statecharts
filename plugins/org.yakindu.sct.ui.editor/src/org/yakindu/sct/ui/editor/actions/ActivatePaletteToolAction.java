package org.yakindu.sct.ui.editor.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.gef.Request;
import org.eclipse.gef.palette.CombinedTemplateCreationEntry;
import org.eclipse.gef.palette.PaletteDrawer;
import org.eclipse.gef.ui.actions.WorkbenchPartAction;
import org.eclipse.ui.IWorkbenchPart;
import org.yakindu.sct.ui.editor.editor.StatechartDiagramEditor;

public class ActivatePaletteToolAction extends WorkbenchPartAction {
	private final String ID_PREFIX = "ONKEY_";
	private final String ID ;
	//private final String REQUEST;
	private final Request request;
	CombinedTemplateCreationEntry toolEntry;

	/**
	 * private defualt constructor, action requires tool id
	 * @param part
	 */
	private ActivatePaletteToolAction(IWorkbenchPart part) {
		super(part);
		ID = null;
		request = null;
	}
	
	/**
	 * Creates action that activates a tool from the palette
	 * 
	 * @param part the workbench part
	 * @param id id of the tool to be activated
	 */
	public ActivatePaletteToolAction(IWorkbenchPart part, String id) {
		super(part);
		ID = id ;
		request = new Request(ID_PREFIX + ID);
		setId(ID);
		toolEntry = findToolEntry();
	}

	public Request getRequest() {
	    return request;
	  }
	
	@Override
	 public void run() {
		if(toolEntry != null) {
			// activate tool
			 StatechartDiagramEditor editor = (StatechartDiagramEditor) getWorkbenchPart();		  
			 editor.getEditDomain().getPaletteViewer().setActiveTool(toolEntry);
		}
	  }
	
	@Override
	protected boolean calculateEnabled() {
		return true;
	}
	
	private CombinedTemplateCreationEntry findToolEntry() {
		StatechartDiagramEditor editor = (StatechartDiagramEditor) getWorkbenchPart();
		PaletteDrawer children = (PaletteDrawer) editor.getEditDomain()
				.getPaletteViewer()
				.getPaletteRoot()
				.getChildren()
				.get(1); // 1 is palette drawer, 0 are default tools
		  
		List entries = children.getChildren();
		if(entries.size() > 0) {
			for (Object currentEntry : entries) {
				if(currentEntry instanceof CombinedTemplateCreationEntry) {
					if(((CombinedTemplateCreationEntry) currentEntry)
							.getLabel() // search correct tool by label
							.replaceAll("\\s","") // some labels contain whitespaces
							.equals(ID)) {
								return (CombinedTemplateCreationEntry) currentEntry;
					}
				}
			}
		}
		return null;
	}
	
}
