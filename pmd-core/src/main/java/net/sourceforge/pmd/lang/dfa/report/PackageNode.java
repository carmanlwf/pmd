/**
 * BSD-style license; for more info see http://pmd.sourceforge.net/license.html
 */

package net.sourceforge.pmd.lang.dfa.report;

@Deprecated // will be removed with PMD 7.0.0 without replacement. See net.sourceforge.pmd.lang.dfa.report.ReportTree for details.
public class PackageNode extends AbstractReportNode {

    private String packageName;

    public PackageNode(String packageName) {
        this.packageName = packageName;
    }

    public String getPackageName() {
        return this.packageName;
    }

    @Override
    public boolean equalsNode(AbstractReportNode arg0) {
        if (!(arg0 instanceof PackageNode)) {
            return false;
        }

        return ((PackageNode) arg0).getPackageName().equals(this.packageName);
    }

}
