package example.controller;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;

public class TestController {

	public static final class BooleanValueContainer implements Serializable {
        
		private static final long serialVersionUID = 1L;
		
		private final String title;
        private boolean checked = false;

        BooleanValueContainer(String title) {
            this.title = title;
        }

        /**
         * Returns the checked.
         *
         * @return the checked
         */
        public final boolean isChecked() {
            return checked;
        }

        /**
         * Sets the checked.
         *
         * @param checked the checked to set
         */
        public final void setChecked(boolean checked) {
            this.checked = checked;
        }

        /**
         * Returns the title.
         *
         * @return the title
         */
        public final String getTitle() {
            return title;
        }
        
        public int identityHashCode() {
            return System.identityHashCode(this);
        }
        
    }
    
    private final List<BooleanValueContainer> forEachContainers = Arrays.asList(new BooleanValueContainer("Container One [ForEach]"));
    
    public List<BooleanValueContainer> getForEachContainers() {
        return forEachContainers;
    }
	
}
