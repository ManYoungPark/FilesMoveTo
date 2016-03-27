package pft_filesmove;

import java.io.File;
import java.io.IOException;
import java.util.Collection;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.TrueFileFilter;

public class test
{

	public static void main(String[] args) throws IOException
	{
		// TODO Auto-generated method stub

		String dirs1 = "G:\\All_pft_txts";
		String destdir = "G:\\PFT_image\\medinfo_emr_after";

		File myFile = new File(dirs1);

		Collection<File> listOfFiles = FileUtils.listFilesAndDirs(myFile, TrueFileFilter.TRUE, TrueFileFilter.TRUE);

		int i = 0;
		for (File file1 : listOfFiles)
		{
			i++;
			if (file1.isDirectory())
			{

				System.out.println("Directory: ");

			} else
			{
				System.out.println("File: ");

				String src = destdir + "\\" + file1.getName().replace(".txt", ".png");
				File f = new File(src);

				String filenameDir = null;
				File fmove = null;

				if (f.isFile())
				{
					filenameDir = file1.getAbsolutePath().replace(dirs1, destdir);

					int index = filenameDir.lastIndexOf("\\");
					filenameDir = filenameDir.substring(0, index + 1);

					fmove = new File(filenameDir);

					FileUtils.moveFileToDirectory(f, fmove, true);
					System.out.println(f.getAbsolutePath() + " 에서 " + fmove.getAbsolutePath() + "로 이동");
					continue;

				}

				src = destdir + "\\" + file1.getName().replace(".txt", ".gif");
				f = new File(src);

				filenameDir = null;
				fmove = null;

				if (f.isFile())
				{
					filenameDir = file1.getAbsolutePath().replace(dirs1, destdir);

					int index = filenameDir.lastIndexOf("\\");
					filenameDir = filenameDir.substring(0, index + 1);

					fmove = new File(filenameDir);

					FileUtils.moveFileToDirectory(f, fmove, true);
					System.out.println(f.getAbsolutePath() + " 에서 " + fmove.getAbsolutePath() + "로 이동");
					continue;

				}

				src = destdir + "\\" + file1.getName().replace(".txt", ".jpg");
				f = new File(src);

				filenameDir = null;
				fmove = null;

				if (f.isFile())
				{
					filenameDir = file1.getAbsolutePath().replace(dirs1, destdir);

					int index = filenameDir.lastIndexOf("\\");
					filenameDir = filenameDir.substring(0, index + 1);

					fmove = new File(filenameDir);

					FileUtils.moveFileToDirectory(f, fmove, true);
					System.out.println(f.getAbsolutePath() + " 에서 " + fmove.getAbsolutePath() + "로 이동");
					continue;

				}

			}

			System.out.println(file1.getAbsolutePath() + "    " + i);
		}

	}

}
